package menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    final WebDriver driver;
    final WebDriverWait wait;
    public AdminPage(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
