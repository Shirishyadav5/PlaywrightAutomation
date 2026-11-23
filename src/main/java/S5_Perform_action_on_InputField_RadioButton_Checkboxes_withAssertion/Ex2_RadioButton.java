package S5_Perform_action_on_InputField_RadioButton_Checkboxes_withAssertion;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Ex2_RadioButton
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
        Locator Radiobuttonmale = page.locator("input#male");

//        check visibility & enabled status of radio button
        PlaywrightAssertions.assertThat(Radiobuttonmale).isVisible();
        PlaywrightAssertions.assertThat(Radiobuttonmale).isEnabled();

//        check radio button should not be selected by default
        PlaywrightAssertions.assertThat(Radiobuttonmale).not().isChecked();

        Radiobuttonmale.check();

//      verify radio button is selected
        PlaywrightAssertions.assertThat(Radiobuttonmale).isChecked();
        Thread.sleep(2000);
        browser.close();
        pw.close();







    }
}
