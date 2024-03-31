import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class PlayMusicTest {
    HomePage homePage = new HomePage();

    @Test
    public void playMusic() throws InterruptedException {
        homePage.openLoggedIn().checkMainPage();
        homePage.setPlayMusic();
        TimeUnit.SECONDS.sleep(3);
    }
}
