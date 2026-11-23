package S4_XPath_and_CSS_Locator;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex1_Xpath
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com");
        Thread.sleep(3000);
//      Enter name
        page.locator("//input[@id='name']").fill("abc");
//      Enter Email
        page.locator("//input[@id='email']").fill("xyz");

        Thread.sleep(3000);
        browser.close();
        pw.close();













    }
}
