package eu.brugger.martin.acceptance.framework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("firefox")
public class FirefoxDriverFactory implements DriverFactory {

    public WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();
        return (new FirefoxDriver());
    }
}
