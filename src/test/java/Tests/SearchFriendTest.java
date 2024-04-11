package Tests;

import Core.BaseTest;
import Pages.FriendsPage;
import Pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

public class SearchFriendTest extends BaseTest {

    @ParameterizedTest()
    @ValueSource(strings = {"technopol51 technopol51"})
    public void addFrends(String username) throws InterruptedException {
        HomePage homePage = new HomePage();
        FriendsPage friendsPage = new FriendsPage();
        friendsPage.openHomePage().checkFriendsPage();
        homePage.clickFiendsButton();
        friendsPage.set(username);
        Assertions.assertEquals(username, friendsPage.getUsername());

        TimeUnit.SECONDS.sleep(3);
    }

}
