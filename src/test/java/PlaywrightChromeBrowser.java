import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class PlaywrightChromeBrowser {

    @Test
    void launchBrowser() {
      BrowserType.LaunchOptions options = new BrowserType.LaunchOptions();
        options.setChannel("chrome");
        options.setHeadless(false);

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(options);
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
