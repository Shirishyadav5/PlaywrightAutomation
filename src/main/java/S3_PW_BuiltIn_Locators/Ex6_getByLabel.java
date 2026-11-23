package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex6_getByLabel
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
        Thread.sleep(2000);

        page.getByLabel("email").fill("abc@gmail.com");

        Thread.sleep(3000);
        browser.close();
        pw.close();
    }
}
