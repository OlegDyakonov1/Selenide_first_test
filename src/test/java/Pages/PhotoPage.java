package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PhotoPage {
    private static final ElementsCollection NAVIGATIONTOOLBARBUTTONS = $$(By.xpath("//*[contains(@class,'toolbar_nav_a')]"));
    private static final ElementsCollection NAVIGATIONBUTTONS = $$(By.xpath("//div[@class='nav-side_i-w']"));
    private static final SelenideElement NAVIGATIONTOOLBAR = $(By.xpath("//div[@data-l='t,navigationToolbar']"));
    private static final SelenideElement NAVIGATIONBAR = $(By.xpath("//div[@class='nav-side __navigation __user-main']"));
    private static final SelenideElement IMAGES = $(By.xpath("//img[@class='collageFrame_img__dg4ov']"));
    private static final SelenideElement IMAGEOK = $(By.xpath("//*[@class='photo-card_cnt']"));

    public PhotoPage openHomePage() {
        HomePage homePage = new HomePage();
        homePage.openLoggedIn();
        NAVIGATIONTOOLBAR.shouldBe();
        NAVIGATIONBAR.shouldBe();
        IMAGEOK.shouldBe();
        Assertions.assertEquals(8, NAVIGATIONTOOLBARBUTTONS.size());
        Assertions.assertEquals(11, NAVIGATIONBUTTONS.size());
        return this;
    }

    public void clickImages() {
        IMAGES.shouldBe().click();
    }
    public void clickImageOK() {
        IMAGEOK.shouldBe().click();
    }


}
