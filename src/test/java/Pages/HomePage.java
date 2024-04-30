package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    private static final SelenideElement NAVIGATIONTOOLBAR = $(By.xpath("//div[@data-l='t,navigationToolbar']"));
    private static final ElementsCollection NAVIGATIONTOOLBARBUTTONS = $$(By.xpath("//*[contains(@class,'toolbar_nav_a')]"));
    private static final ElementsCollection NAVIGATIONBUTTONS = $$(By.xpath("//div[@class='nav-side_i-w']"));
    private static final SelenideElement NAVIGATIONBAR = $(By.xpath("//div[@class='nav-side __navigation __user-main']"));
    private static final SelenideElement OPENMESSENGERBUTTON = $(By.xpath("//*[@id='msg_toolbar_button']"));
    private static final SelenideElement SEARCHFRIENDS = $(By.xpath("//*[@class='base-input-okmsg']"));
    private static final SelenideElement OPENMUSIC = $(By.xpath("//div[@class='toolbar_music-container']"));
    private static final SelenideElement PLAYMUSIC = $(By.xpath("//*[@type='button'][@class='play __active']"));
    private static final SelenideElement OPENVIDEO = $(By.xpath("//*[@id='hook_Block_TopMenuVideo']"));
    private static final SelenideElement PLAYVIDEO = $(By.xpath("//div[@class='h-mod video-card_preview']"));
    private static final SelenideElement FRIENDSBUTTON = $(By.xpath("//*[@data-l='t,userFriend']"));
    private static final SelenideElement OPENPHOTO = $(By.xpath("//a[@data-l='t,userPhotos']"));

    private static final String CORRECTLOGIN = "technopol50";
    private static final String CORRECTPASSWORD = "technopolisPassword";

    public HomePage openLoggedIn() {
        LoginPage loginPage = new LoginPage();
        loginPage.signIn(CORRECTLOGIN, CORRECTPASSWORD);
        NAVIGATIONTOOLBAR.shouldBe();
        NAVIGATIONBAR.shouldBe();
        Assertions.assertEquals(8, NAVIGATIONTOOLBARBUTTONS.size());
        Assertions.assertEquals(11, NAVIGATIONBUTTONS.size());
        return this;
    }


    public void clickMessenger() {
        OPENMESSENGERBUTTON.shouldBe().click();
        SEARCHFRIENDS.shouldBe().click();
    }
    public void clickFiendsButton(){
        FRIENDSBUTTON.shouldBe().click();
    }

    public void setPlayMusic() {
        OPENMUSIC.shouldBe().click();
        PLAYMUSIC.shouldBe().click();
    }

    public void setPlayVideo() {
        OPENVIDEO.shouldBe().click();
        PLAYVIDEO.shouldBe().click();

    }
    public void clickPhoto() {
        OPENPHOTO.shouldBe().click();
    }
}