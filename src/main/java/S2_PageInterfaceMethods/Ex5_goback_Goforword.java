package S2_PageInterfaceMethods;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex5_goback_Goforword
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        Thread.sleep(3000);

        page.navigate("https://www.facebook.com");
        Thread.sleep(3000);
        page.goBack();
        Thread.sleep(2000);
        page.goForward();
        Thread.sleep(3000);

        browser.close();
        pw.close();









    }
}
