package Tests;

import Core.BaseTest;
import Pages.HomePage;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class FriendsButtonTest extends BaseTest {
    HomePage homePage = new HomePage();
    @Test
    public void clickFrendsButton() throws InterruptedException {
        homePage.openLoggedIn().checkMainPage();
        homePage.clickFiendsButton();
        TimeUnit.SECONDS.sleep(3);
    }

}

