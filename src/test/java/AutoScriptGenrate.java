import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;


public class AutoScriptGenrate {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://www.google.com/");
            page.navigate("https://www.facebook.com/");
            page.getByTestId("open-registration-form-button").click();
            page.getByPlaceholder("First name").click();
            page.getByPlaceholder("First name").fill("aa");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Surname")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Surname")).fill("aa");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("New password")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number or email address")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number or email address")).fill("aaa");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("New password")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("New password")).fill("assas");
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Day")).selectOption("15");
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Month")).selectOption("8");
            page.getByText("First nameSurnameMobile number or email addressRe-enter email addressNew passwor").click();
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Year")).selectOption("2006");
            page.getByText("Male", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
            page.close();
        }
    }
}