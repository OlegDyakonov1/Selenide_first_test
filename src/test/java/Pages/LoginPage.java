package Pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final SelenideElement LOGININPUT = $(By.xpath("//*[@id=\"field_email\"]"));
    private static final SelenideElement PASSWORDINPUT = $(By.xpath("//*[@id=\"field_password\"]"));
    private static final SelenideElement LOGINBUTTON = $(By.xpath("//div[@class='button-pro __wide']"));
    private static final SelenideElement LOGINERRORTEXT = $(By.xpath("//div[@class='input-e login_error']"));


    public LoginPage open() {
        LOGININPUT.shouldBe();
        PASSWORDINPUT.shouldBe();
        LOGINBUTTON.shouldBe();
        return this;
    }


    public void signIn(String login, String password) {
        LOGININPUT.setValue(login);
        PASSWORDINPUT.setValue(password).pressEnter();
    }

    public void checkIncorrectLogin() {
        LOGINERRORTEXT.shouldBe();
        Assertions.assertEquals("Неправильно указан логин и/или пароль", LOGINERRORTEXT.getText());
    }
}