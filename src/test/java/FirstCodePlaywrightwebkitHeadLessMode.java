import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class FirstCodePlaywrightwebkitHeadLessMode {

    @Test
    void launchBrowser() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.webkit().launch();
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
