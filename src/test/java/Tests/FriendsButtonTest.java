package Tests;

import Core.BaseTest;
import Pages.HomePage;
import org.junit.jupiter.api.Test;

public class FriendsButtonTest extends BaseTest {
    HomePage homePage = new HomePage();
    @Test
    public void clickFrendsButton(){
        homePage.openLoggedIn();
        homePage.clickFiendsButton();

    }

}

