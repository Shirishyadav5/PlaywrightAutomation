package S5_Perform_action_on_InputField_RadioButton_Checkboxes_withAssertion;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Ex1_InputField
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
//      Click on the element with specified text
        Locator name = page.locator("#name");
//      verify name input field is visible
        PlaywrightAssertions.assertThat(name).isVisible();

//      verify name input field is enable
        PlaywrightAssertions.assertThat(name).isEnabled();

//      verify name input field is maxlength value with 15
        PlaywrightAssertions.assertThat(name).hasAttribute("maxlength","15");

        name.fill("abc");

//        verify name input field has value
        PlaywrightAssertions.assertThat(name).hasValue("abc");

        Thread.sleep(3000);
        browser.close();
        pw.close();


    }
}
