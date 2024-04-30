package Tests;

import Core.BaseTest;
import Pages.HomePage;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class PlayMusicTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void playMusic() throws InterruptedException {
        homePage.openLoggedIn();
        homePage.setPlayMusic();
        TimeUnit.SECONDS.sleep(3);
    }
}
