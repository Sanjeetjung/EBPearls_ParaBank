package pages;

import menu.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    final WebDriver driver;
    final WebDriverWait wait;

    final By register = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    final By userName = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    final By passWord = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    final By submitLoginButton = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    final By forgetLogin = By.xpath("//*[@id=\"loginPanel\"]/p[1]/a");

    final By aboutUS = By.xpath("//*[@id=\"loginPanel\"]/p[1]/a");
    final By services = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a");
    final By products = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a");
    final By locations = By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a");
    final By adminPage =By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a");
    final By homePage = By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a");
    final By aboutUsIcon = By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a");
    final By contactUs = By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a");

    public LoginPage(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setUserName(String userName1){
        wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(userName1);
    }
    public void setPassword(String password1){
        wait.until(ExpectedConditions.elementToBeClickable(passWord)).sendKeys(password1);
    }

    public ForgetLoginInfoPage forgetLoginInfoPage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(forgetLogin));
        element.click();
        return new ForgetLoginInfoPage(driver);
    }

    public RegisteredUserHomePage clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(submitLoginButton)).click();
        return new RegisteredUserHomePage(driver);
    }

    public RegisterPage clickRegister(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(register));
        element.click();
        return new RegisterPage(driver);
    }
    public AboutUsPage clickAboutUs(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(aboutUS));
        element.click();
        return new AboutUsPage(driver);
    }
    public ServicesPage clickServices(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(services));
        element.click();
        return new ServicesPage(driver);
    }
    public ProductsPage clickProducts(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(products));
        element.click();
        return new ProductsPage(driver);
    }
    public LocationsPage clickLocations(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locations));
        element.click();
        return new LocationsPage(driver);
    }
    public AdminPage clickAdmin(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(adminPage));
        element.click();
        return new AdminPage(driver);
    }
    public ContactUsPage clickContactUs(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(contactUs));
        element.click();
        return new ContactUsPage(driver);
    }
    public LoginPage clickHome(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(homePage));
        element.click();
        return new LoginPage(driver);
    }
    public AboutUsPage clickAboutUsIcon(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(aboutUsIcon));
        element.click();
        return new AboutUsPage(driver);
    }

}
