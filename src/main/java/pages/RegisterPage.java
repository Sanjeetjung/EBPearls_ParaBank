package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    final WebDriver driver;
    final WebDriverWait wait;

    final By firstName = By.xpath("//*[@id=\"customer.firstName\"]");
    final By lastName = By.xpath("//*[@id=\"customer.lastName\"]");
    final By address = By.xpath("//*[@id=\"customer.address.street\"]");
    final By city = By.xpath("//*[@id=\"customer.address.city\"]");
    final By state = By.xpath("//*[@id=\"customer.address.state\"]");
    final By zipCode = By.xpath("//*[@id=\"customer.address.zipCode\"]");
    final By phoneNumber = By.xpath("//*[@id=\"customer.phoneNumber\"]");
    final By ssNumber = By.xpath("//*[@id=\"customer.ssn\"]");
    final By userName = By.xpath("//*[@id=\"customer.username\"]");
    final By password = By.xpath("//*[@id=\"customer.password\"]");
    final By confirmPassword = By.xpath("//*[@id=\"repeatedPassword\"]");
    final By registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    public RegisterPage(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setFirstName(String firstname){
        wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys(firstname);
    }
    public void setLastName(String lastname){
        wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys(lastname);
    }
    public void setAddress(String addressName){
        wait.until(ExpectedConditions.elementToBeClickable(address)).sendKeys(addressName);
    }
    public void setCity(String cityName){
        wait.until(ExpectedConditions.elementToBeClickable(city)).sendKeys(cityName);
    }
    public void setState(String stateName){
        wait.until(ExpectedConditions.elementToBeClickable(state)).sendKeys(stateName);
    }
    public void setZipCode(String zipcode){
        wait.until(ExpectedConditions.elementToBeClickable(zipCode)).sendKeys(zipcode);
    }
    public void setPhoneNumber(String phonenumber){
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber)).sendKeys(phonenumber);
    }
    public void setSsnumber(String ssnumber){
        wait.until(ExpectedConditions.elementToBeClickable(ssNumber)).sendKeys(ssnumber);
    }
    public void setUserName(String username){
        wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(username);
    }
    public void setPassword(String password1){
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(password1);
    }
    public void setConfirmPassword(String confirmpassword){
        wait.until(ExpectedConditions.elementToBeClickable(confirmPassword)).sendKeys(confirmpassword);
    }

    public LoginPage clickRegisterButton(){
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
        return new LoginPage(driver);
    }
}
