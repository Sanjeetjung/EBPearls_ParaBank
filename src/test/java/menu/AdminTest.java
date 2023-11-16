package menu;

import base.BaseTests;
import org.testng.annotations.Test;

public class AdminTest extends BaseTests {
    @Test
    public void testSuccessfullAdmin(){
        AdminPage adminPage = loginPage.clickAdmin();

    }
}
