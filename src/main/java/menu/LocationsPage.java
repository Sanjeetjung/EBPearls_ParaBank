package menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocationsPage {
    final WebDriver driver;
    final WebDriverWait wait;
    public LocationsPage(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
