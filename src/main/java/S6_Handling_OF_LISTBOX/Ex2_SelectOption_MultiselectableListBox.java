package S6_Handling_OF_LISTBOX;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

public class Ex2_SelectOption_MultiselectableListBox
{
    static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        page.waitForTimeout(1000);

        Locator colors = page.locator("#colors");

//      3 ways to select multiple options (Text/label, Value, Index)

//        1. select multiple option using Text
//        String [] multipleText={"Blue","Red","Green"};
//        colors.selectOption(multipleText);
//        page.waitForTimeout(3000);

//        2. select multiple option using value
//        String [] multiplevalue={"red","blue","green"};
//        colors.selectOption(multiplevalue);
//        page.waitForTimeout(3000);

//        3. select multiple option using index---index start from zero
        SelectOption [] multipleindex={ new SelectOption().setIndex(0),
                                        new SelectOption().setIndex(1),
                                        new SelectOption().setIndex(2)};

        colors.selectOption(multipleindex);
        page.waitForTimeout(3000);
        browser.close();
        pw.close();
    }
}
