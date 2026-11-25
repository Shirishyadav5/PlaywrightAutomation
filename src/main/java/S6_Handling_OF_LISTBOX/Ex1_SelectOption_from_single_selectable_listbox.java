package S6_Handling_OF_LISTBOX;

import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

public class Ex1_SelectOption_from_single_selectable_listbox
{
    static void main(String[] args)
    {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://testautomationpractice.blogspot.com/");
        page.waitForTimeout(5000);

        Locator country = page.locator("#country");

//      3 ways to select option (Text, value, index)

//      1 select option using visible text
        country.selectOption("France");
        page.waitForTimeout(3000);

//      2 select option using value
        country.selectOption("India");
        page.waitForTimeout(3000);

//      3 select option using index
        SelectOption s=new SelectOption();
        country.selectOption(s.setIndex(1));
        page.waitForTimeout(3000);

//  // 2. Count total number of options
        Locator alloptions = page.locator("#country>option");
        int count = alloptions.count();
        System.out.println("Total options: "+count);

//        verify country list box has total 10 options
        PlaywrightAssertions.assertThat(alloptions).hasCount(10);

        System.out.println("Total options is 10");

//      Print all options text
        List<String> alltextoptions = alloptions.allTextContents();
        for (String textoption:alltextoptions)
        {
            System.out.println(textoption.trim());
        }

        page.waitForTimeout(3000);
        browser.close();
        pw.close();

    }
}
