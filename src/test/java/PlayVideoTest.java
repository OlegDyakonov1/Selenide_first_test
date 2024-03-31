import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class PlayVideoTest {
    HomePage homePage = new HomePage();
    @Test
    public void playVideoTest() throws InterruptedException {
        homePage.openLoggedIn().checkMainPage();
        homePage.setPlayVideo();
        TimeUnit.SECONDS.sleep(5);
    }
}
