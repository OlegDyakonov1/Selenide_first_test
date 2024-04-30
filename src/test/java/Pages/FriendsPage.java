package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FriendsPage {
    private static final ElementsCollection NAVIGATIONTOOLBARBUTTONS = $$(By.xpath("//*[contains(@class,'toolbar_nav_a')]"));
    private static final ElementsCollection NAVIGATIONBUTTONS = $$(By.xpath("//div[@class='nav-side_i-w']"));
    private static final SelenideElement SEARCHFRIENDSBUTTON = $(By.xpath("//div[@class='stub-empty_controls']/a"));
    private static final SelenideElement SEARCHINPUT = $(By.xpath("//input[@type='search']"));
    private static final SelenideElement PROFIL = $(By.xpath("//div[@class='ellip']/a"));




    public FriendsPage openHomePage() {
        HomePage homePage = new HomePage();
        homePage.openLoggedIn();
        SEARCHFRIENDSBUTTON.shouldBe();
        Assertions.assertEquals(8, NAVIGATIONTOOLBARBUTTONS.size());
        Assertions.assertEquals(11, NAVIGATIONBUTTONS.size());
        return this;
    }

    public void  clickSearchFriendsButton(){
        SEARCHFRIENDSBUTTON.click();
    }
    public void set(String user){
        SEARCHINPUT.shouldBe().click();
        SEARCHINPUT.setValue(user).pressEnter();
    }
    

    public String getUsername(){
        return PROFIL.shouldBe().getText();

    }



}
