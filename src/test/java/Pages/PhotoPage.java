package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PhotoPage {
    private final ElementsCollection navigationToolBarButtons = $$(By.xpath("//*[contains(@class,'toolbar_nav_a')]"));
    private final ElementsCollection navigationButtons = $$(By.xpath("//div[@class='nav-side_i-w']"));
    private final SelenideElement navigationToolBar = $(By.xpath("//div[@data-l='t,navigationToolbar']"));
    private final SelenideElement navigationBar = $(By.xpath("//div[@class='nav-side __navigation __user-main']"));
    private final SelenideElement images = $(By.xpath("//img[@class='collageFrame_img__dg4ov']"));
    private final SelenideElement imageOK = $(By.xpath("//*[@class='photo-card_cnt']"));

    public PhotoPage openHomePage() {
        HomePage homePage = new HomePage();
        homePage.openLoggedIn().checkMainPage();
        return this;
    }

    public void checkPhotoPage() {
        navigationToolBar.shouldBe();
        navigationBar.shouldBe();
        imageOK.shouldBe();
        Assertions.assertEquals(8, navigationToolBarButtons.size());
        Assertions.assertEquals(11, navigationButtons.size());
    }
    public void clickImages() {
        images.shouldBe().click();
    }
    public void clickImageOK() {
        imageOK.shouldBe().click();
    }


}
