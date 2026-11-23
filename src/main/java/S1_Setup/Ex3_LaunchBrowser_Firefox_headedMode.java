package S1_Setup;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex3_LaunchBrowser_Firefox_headedMode
{
    static void main(String[] args) throws InterruptedException {

        Playwright pw = Playwright.create();        //1: Launches Playwright server
        Browser browser = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));  //Launches the Firefox browser in headed mode by default
        Page page = browser.newPage();          //3. create a new page in browser

        page.navigate("https://www.google.com");
        Thread.sleep(5000);

        browser.close();
        pw.close();

    }
}
