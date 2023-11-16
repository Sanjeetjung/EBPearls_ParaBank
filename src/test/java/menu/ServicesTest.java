package menu;

import base.BaseTests;
import org.testng.annotations.Test;

public class ServicesTest extends BaseTests {
    @Test
    public void testSuccessfullServices(){
        ServicesPage servicesPage = loginPage.clickServices();

    }
}
