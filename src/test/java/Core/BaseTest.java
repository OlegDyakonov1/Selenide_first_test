package Core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



abstract public class BaseTest {
    private final String BaseURL = "https://ok.ru/";

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.baseUrl = "https://ok.ru/";
        Selenide.open("/");
    }

    @AfterAll
    public static void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
