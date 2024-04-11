package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FriendsPage {
    private final ElementsCollection navigationToolBarButtons = $$(By.xpath("//*[contains(@class,'toolbar_nav_a')]"));
    private final ElementsCollection navigationButtons = $$(By.xpath("//div[@class='nav-side_i-w']"));
    private final SelenideElement searchFriendsButton = $(By.xpath("//div[@class='stub-empty_controls']/a"));
    private final SelenideElement searchInput = $(By.xpath("//input[@type='search']"));
    private final SelenideElement profil = $(By.xpath("//div[@class='ellip']/a"));




    public FriendsPage openHomePage() {
        HomePage homePage = new HomePage();
        homePage.openLoggedIn().checkMainPage();
        return this;
    }

    public void checkFriendsPage() {
        searchFriendsButton.shouldBe();
        Assertions.assertEquals(8, navigationToolBarButtons.size());
        Assertions.assertEquals(11, navigationButtons.size());
    }
    public void  clickSearchFriendsButton(){
        searchFriendsButton.click();
    }
    public void set(String user){
        searchInput.shouldBe().click();
        searchInput.setValue(user).pressEnter();
    }
    

    public String getUsername(){
        return profil.shouldBe().getText();

    }



}
