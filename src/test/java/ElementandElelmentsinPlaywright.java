import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class ElementandElelmentsinPlaywright {

    @Test
    void elementandElements() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page p1 = browser.newPage();
        p1.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
       /* System.out.println(p1.title());
        Locator loctor = p1.locator("text = Try it for Free").first();
        int value = loctor.count();
        System.out.println(value);
        loctor.last().click();

        */

        Locator countryOptions = p1.locator("select#Form_getForm_Country option");
        System.out.println(countryOptions.count());

        for (int i = 0; i < countryOptions.count(); i++) {

            String text = countryOptions.nth(i).textContent();
            System.out.println(text);
        }


    }
}
