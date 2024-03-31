import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {
    private static final String driverPath = "C:\\Java\\.cache\\selenium\\chromedriver\\win64\\123.0.6312.86\\chromedriver.exe";
    @BeforeAll
    public static void setUp() {
        Configuration.baseUrl = "https://ok.ru/";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}