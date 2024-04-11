package Tests;

import Core.BaseTest;
import Pages.HomePage;
import Pages.PhotoPage;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class OpenPhotoTest extends BaseTest {
    HomePage homePage = new HomePage();
    PhotoPage photoPage = new PhotoPage();
    @Test
    public void openImages() throws InterruptedException {
        photoPage.openHomePage().checkPhotoPage();
        homePage.clickPhoto();
        photoPage.clickImages();
        photoPage.clickImageOK();
        TimeUnit.SECONDS.sleep(3);
    }
}
