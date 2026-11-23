package S3_PW_BuiltIn_Locators;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ex1_getByText2
{
    static void main(String[] args) throws InterruptedException {
        Playwright pw = Playwright.create();
        Page page = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)).newPage();
        page.navigate("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");

        page.getByText("START").click();

        Thread.sleep(4000);
        page.close();
        pw.close();











    }
}
