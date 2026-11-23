package S1_Setup;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex1_LaunchBrowser_byDefaultHeadlessMode
{
    static void main(String[] args) throws InterruptedException {

        Playwright pw = Playwright.create();                // 1: Launches the Playwright server
        Browser browser = pw.chromium().launch();           // 2: Launches the Chromium browser in headless mode by default
        Page page = browser.newPage();                      // 3: Creates a new page in the browser

        page.navigate("https://www.google.com");        // 4: Navigates to the specified URL
        Thread.sleep(5000);

        browser.close();                                   // 5: Closes the browser
        pw.close();                                        // 6: Closes the Playwright server



    }
}
