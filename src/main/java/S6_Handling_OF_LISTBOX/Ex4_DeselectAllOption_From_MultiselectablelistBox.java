package S6_Handling_OF_LISTBOX;

import com.microsoft.playwright.*;

public class Ex4_DeselectAllOption_From_MultiselectablelistBox
{
    static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        page.waitForTimeout(3000);
        Locator colors = page.locator("select#colors");

//        select option using value
        String [] ar={"red","blue","green"};
        colors.selectOption(ar);
        page.waitForTimeout(3000);

//        Deselect all option
        String [] ar1={};
        colors.selectOption(ar1);
        page.waitForTimeout(3000);
        browser.close();
        pw.close();







    }
}
