import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class FirstCodePlaywrightFireFoxHeadLessMode {

    @Test
    void launchBrowser() {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch();
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
