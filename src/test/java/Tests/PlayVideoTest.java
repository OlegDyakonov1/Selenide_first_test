package Tests;

import Core.BaseTest;
import Pages.HomePage;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class PlayVideoTest extends BaseTest {
    HomePage homePage = new HomePage();
    @Test
    public void playVideoTest() throws InterruptedException {
        homePage.openLoggedIn();
        homePage.setPlayVideo();
        TimeUnit.SECONDS.sleep(5);
    }
}
