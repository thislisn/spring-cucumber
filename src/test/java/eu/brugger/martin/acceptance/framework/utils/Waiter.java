package eu.brugger.martin.acceptance.framework.utils;

import eu.brugger.martin.acceptance.framework.driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

@Component
public class Waiter {
    private static final Logger logger = LoggerFactory.getLogger(Waiter.class);

    @Autowired
    private DriverProvider driverProvider;

    public <T> T waitUntilExpected(Function<WebDriver, T> function, final long... msToWait) {
        long msToWaitLoc = msToWait.length > 0 ? msToWait[0] : TimeOutConstants.DEFAULT_TIMEOUT_20_000_MS;
        WebDriverWait wait = new WebDriverWait(driverProvider.getInstance(), msToWaitLoc / 1000);
        wait.pollingEvery(Duration.of(TimeOutConstants.DEFAULT_POLLING_TIMEOUT_500_MS, ChronoUnit.MILLIS));
        return wait.until(function);
    }

    public <T> Boolean waitUntilWebElementDisplayed(WebElement element, final long... msToWait) {
        long msToWaitLoc = msToWait.length > 0 ? msToWait[0] : TimeOutConstants.DEFAULT_TIMEOUT_20_000_MS;
        return waitUntilExpected(webDriver -> element.isDisplayed(), msToWaitLoc);
    }

    public class TimeOutConstants {
        public static final int DEFAULT_TIMEOUT_20_000_MS = 20_000;
        public static final int DEFAULT_TIMEOUT_5_000_MS = 5_000;
        public static final int DEFAULT_POLLING_TIMEOUT_500_MS = 500;
    }
}
