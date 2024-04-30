package Tests;

import Core.BaseTest;
import Pages.HomePage;
import Pages.PhotoPage;
import org.junit.jupiter.api.Test;

public class OpenPhotoTest extends BaseTest {
    HomePage homePage = new HomePage();
    PhotoPage photoPage = new PhotoPage();
    @Test
    public void openImages() {
        photoPage.openHomePage();
        homePage.clickPhoto();
        photoPage.clickImages();
        photoPage.clickImageOK();

    }
}
