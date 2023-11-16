package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgetLoginInfoPage {
    final WebDriver driver;
    final WebDriverWait wait;
    public ForgetLoginInfoPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    final By firstName = By.xpath("//*[@id=\"firstName\"]");
    final By lastName = By.xpath("//*[@id=\"lastName\"]");
    final By address = By.xpath("//*[@id=\"address.street\"]");
    final By city = By.xpath("//*[@id=\"address.city\"]");
    final By state = By.xpath("//*[@id=\"address.state\"]");
    final By zipCode = By.xpath("//*[@id=\"address.zipCode\"]");
    final By SSNumber = By.xpath("//*[@id=\"ssn\"]");
    final By findMyLoginInfoButton = By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input");

    public void setFirstName(String firstName1){
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys(firstName1);
    }
    public void setLastName(String lastName1){
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys(lastName1);
    }
    public void setAdress(String address1){
        wait.until(ExpectedConditions.elementToBeClickable(address)).sendKeys(address1);
    }
    public void setCity(String city1){
        wait.until(ExpectedConditions.elementToBeClickable(city)).sendKeys(city1);
    }
    public void setState(String state1){
        wait.until(ExpectedConditions.elementToBeClickable(state)).sendKeys(state1);
    }
    public void setZipCode(String zipCode1){
        wait.until(ExpectedConditions.elementToBeClickable(zipCode)).sendKeys(zipCode1);
    }
    public void setSSNumber(String ssNumber){
        wait.until(ExpectedConditions.elementToBeClickable(SSNumber)).sendKeys(ssNumber);
    }
    public LoginPage clickFindMyLoginInfoButton(){
        wait.until(ExpectedConditions.elementToBeClickable(findMyLoginInfoButton)).click();
        return new LoginPage(driver);
    }


}
