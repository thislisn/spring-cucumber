package eu.brugger.martin.acceptance.framework.driver;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

public interface DriverFactory {
    WebDriver getDriver();
}
