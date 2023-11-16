package menu;

import base.BaseTests;
import org.testng.annotations.Test;

public class AboutUsTest extends BaseTests {
    @Test
    public void testSuccessfullAboutUs(){
        AboutUsPage aboutUsPage = loginPage.clickAboutUs();
        AboutUsPage aboutUsPage1 = loginPage.clickAboutUsIcon();

    }

}
