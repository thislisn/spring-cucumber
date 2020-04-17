package eu.brugger.martin.acceptance.framework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

@Component
public class DriverFactory {
    @Value("${browser}")
    private String browserName;

    public WebDriver getDriver() {
        switch (browserName) {
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-extensions");
                return (new ChromeDriver(options));
            }
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                return (new FirefoxDriver());
            }
            default: {
                throw new RuntimeException("Browser " + browserName + " is not supported");
            }
        }
    }
}
