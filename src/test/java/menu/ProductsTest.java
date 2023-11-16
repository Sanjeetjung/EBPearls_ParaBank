package menu;

import base.BaseTests;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTests {
    @Test
    public void testSuccessfullProducts(){
        ProductsPage productsPage = loginPage.clickProducts();

    }
}
