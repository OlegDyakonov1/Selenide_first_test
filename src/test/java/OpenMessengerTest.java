import org.junit.jupiter.api.Test;

public class OpenMessengerTest extends BaseTest{
    HomePage homePage = new HomePage();

    @Test
    public void clickOpenMessenger(){
        homePage.openLoggedIn().checkMainPage();
        homePage.clickMessenger();
    }

}
