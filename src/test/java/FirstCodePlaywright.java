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
        page.close();
        playwright.close();

    }

}
