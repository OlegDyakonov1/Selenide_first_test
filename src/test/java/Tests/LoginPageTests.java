package Tests;

import Core.BaseTest;
import Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class LoginPageTests extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void checkLoginPageTest() {
        loginPage.open();
    }

    @Test
    public void checkIncorrectLoginTest() {
        loginPage.open().signIn("qaa_test", "test");
        loginPage.checkIncorrectLogin();
    }

    @Test
    public void checkIncorrectPassword() {
        loginPage.open().signIn("technopol50", "test");
        loginPage.checkIncorrectLogin();
    }

}