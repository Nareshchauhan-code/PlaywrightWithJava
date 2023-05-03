import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.util.List;

public class BrowserContextPlaywright {

    @Test
    void BrowserContext() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browser1 = browser.newContext();
        Page p1 = browser1.newPage();
        p1.navigate("https://google.com");
        System.out.println(p1.title());


        BrowserContext browser2 = browser.newContext();
        Page p2 = browser2.newPage();
        p2.navigate("https://facebook.com");
        System.out.println(p2.title());


        BrowserContext browser3 = browser.newContext();
        Page p3 = browser3.newPage();
        p3.navigate("https://www.youtube.com");
        System.out.println(p3.title());

    }


}
