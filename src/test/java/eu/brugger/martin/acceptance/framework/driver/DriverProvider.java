package eu.brugger.martin.acceptance.framework.driver;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DriverProvider {
    private static final Logger logger = LoggerFactory.getLogger(DriverProvider.class);
    private static ThreadLocal<WebDriver> driverInstance = new ThreadLocal<>();

    @Autowired
    private ChromeDriverFactory driverFactory;

    public WebDriver getInstance() {
        if (driverInstance.get() == null) {
            driverInstance.set(driverFactory.getDriver());
        }
        return driverInstance.get();
    }

}
