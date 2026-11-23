package S1_Setup;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex4_LaunchBrowser_Webkit_headedMode
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();    //launches playwright server
        Browser browser = pw.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));  // 2: Launches the Webkit browser in headless mode by default
        Page page = browser.newPage();          //create new page in the browser

        page.navigate("https://www.google.com");        //navigate to the specified url
        Thread.sleep(5000);
        browser.close();                    //close the browser
        pw.close();                             //closes the playwright server
    }
}
