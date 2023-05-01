import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.awt.*;

public class FirstCodePlaywright {

    @Test
    void launchBrowser() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();
        page.navigate("https://google.com");
        String title = page.title();
        System.out.println(title);
        String url = page.url();
        System.out.println(url);
        page.close();
        playwright.close();

    }

}
