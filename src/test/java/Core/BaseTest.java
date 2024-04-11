package Core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseTest {
    private final String BaseURL = "https://ok.ru/";


    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.baseUrl = BaseURL;

    }
    @AfterEach
    public void closeBrowser(){
        Selenide.closeWebDriver();
    }
}