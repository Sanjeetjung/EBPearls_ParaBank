package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","resources/chromedriver-win64/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        goHome();

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        loginPage = new LoginPage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
