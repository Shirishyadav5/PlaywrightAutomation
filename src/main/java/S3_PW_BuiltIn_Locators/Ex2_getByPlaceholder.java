package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex2_getByPlaceholder
{
    static void main(String[] args) throws InterruptedException
    {
        Playwright pw = Playwright.create();
        Page page = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)).newPage();
        page.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");

        page.getByPlaceholder("Enter your full name").fill("abc");

        Thread.sleep(6000);
        page.close();
        pw.close();
    }
}
