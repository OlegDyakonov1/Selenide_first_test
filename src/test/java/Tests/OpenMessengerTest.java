package Tests;

import Core.BaseTest;
import Pages.HomePage;
import org.junit.jupiter.api.Test;

public class OpenMessengerTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void clickOpenMessenger(){
        homePage.openLoggedIn();
        homePage.clickMessenger();
    }

}
