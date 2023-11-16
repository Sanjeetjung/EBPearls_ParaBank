package menu;

import base.BaseTests;
import org.testng.annotations.Test;

public class LocationsTest extends BaseTests {
    @Test
    public void testSuccessfullLocations(){
        LocationsPage locationsPage = loginPage.clickLocations();

    }
}
