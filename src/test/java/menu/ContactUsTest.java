package menu;

import base.BaseTests;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTests {
    @Test
    public void testSuccessfullContactUs(){
        ContactUsPage contactUsPage = loginPage.clickContactUs();

    }
}
