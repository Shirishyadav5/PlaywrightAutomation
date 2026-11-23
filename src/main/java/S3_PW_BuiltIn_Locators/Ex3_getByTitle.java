package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex3_getByTitle
{
    static void main(String[] args) throws InterruptedException {

        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
        Thread.sleep(3000);

//        click on Home link
        page.getByTitle("Home page link").click();

        Thread.sleep(5000);

        browser.close();
        pw.close();


    }
}
