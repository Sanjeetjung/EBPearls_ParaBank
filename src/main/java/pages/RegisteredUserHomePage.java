package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserHomePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public RegisteredUserHomePage(WebDriver driver) {
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
