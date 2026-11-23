package S5_Perform_action_on_InputField_RadioButton_Checkboxes_withAssertion;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class Ex3_checkBox
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);

        Locator checkbox = page.locator("input#sunday");
//        verify the CheckBox is visible
        PlaywrightAssertions.assertThat(checkbox).isVisible();

//        verify the checkbox is enabled
        PlaywrightAssertions.assertThat(checkbox).isEnabled();

//        verify the checkbox should not be selected by default
        PlaywrightAssertions.assertThat(checkbox).not().isChecked();
        Thread.sleep(3000);

        checkbox.check();

//        verify the checkbox is selected
        PlaywrightAssertions.assertThat(checkbox).isChecked();
        Thread.sleep(3000);

        Thread.sleep(3000);
        browser.close();
        pw.close();

    }
}
