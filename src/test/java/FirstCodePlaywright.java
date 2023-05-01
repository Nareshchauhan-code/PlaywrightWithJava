import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.awt.*;

public class FirstCodePlaywright {

    @Test
    void launchBrowser(){

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        System.out.println(width + ":"+ height);

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
        Page page = context.newPage();
        page.navigate("http://www.amazon.com");
    }



}
