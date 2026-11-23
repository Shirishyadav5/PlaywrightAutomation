package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex5_getByALtText
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
        Thread.sleep(2000);

        boolean result = page.getByAltText("logo image").isVisible();
        if (result)
        {
            System.out.println("Logo is visible");
        }
        else
        {
            System.out.println("Logo image is not visible");
        }
        Thread.sleep(3000);

        browser.close();
        pw.close();






    }
}
