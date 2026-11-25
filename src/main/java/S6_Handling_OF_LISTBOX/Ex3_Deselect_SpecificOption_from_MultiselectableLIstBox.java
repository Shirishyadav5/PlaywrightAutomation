package S6_Handling_OF_LISTBOX;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

public class Ex3_Deselect_SpecificOption_from_MultiselectableLIstBox
{
    static void main(String[] args) {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        page.waitForTimeout(3000);

//        Locate MultiSelectable list BOx
        Locator colors = page.locator("select#colors");

//        select options
        String [] multipleValue={"red","blue","green"};
        colors.selectOption(multipleValue);
        page.waitForTimeout(3000);

//        Deselect specific option using label/Text
//        keep only RED and Blue is selected
//        String [] ar2={"Red","Blue"};
//        colors.selectOption(ar2);
//        page.waitForTimeout(3000);

//      Deselect option using value
//        keep only red and blue is selected
//        String [] ar={"red","blue"};
//        colors.selectOption(ar);
//        page.waitForTimeout(3000);

//      Deselect option using index -- index start from zero
        SelectOption [] multipleindex={new SelectOption().setIndex(0), new SelectOption().setIndex(1)};
        colors.selectOption(multipleindex);
        page.waitForTimeout(3000);
        browser.close();
        pw.close();






    }
}
