package S1_Setup;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex2_LaunchBrowser_Chromium_headedMode
{
    static void main(String[] args) throws InterruptedException {

        Playwright pw = Playwright.create();         // 1: Launches the Playwright server
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));  // 2: Launches the Chromium browser in headless mode by default
        Page page = browser.newPage();              // 3: Create a new Page in the browser

        page.navigate("https://www.google.com");    // 4: Navigates to the specified url
        Thread.sleep(5000);

        browser.close();                            // 5: closes the browser
        pw.close();                                 // 6: closes the Playwright server





    }
}
