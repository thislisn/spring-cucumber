package eu.brugger.martin.acceptance.framework.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import static eu.brugger.martin.acceptance.framework.utils.Waiter.TimeOutConstants.DEFAULT_TIMEOUT_5_000_MS;

@Component
public class HomePage extends BasePage {

    private String PAGE_URL = "%s/";
    private static final String PAGE_HEADER = "Learn Git and GitHub without any code!";
    public static final String PAGE_IDENTIFIER = "Home page";

    @FindBy(css = "h2.shelf-title")
    WebElement header;

    @Override
    public void open() {
        driverProvider.getInstance().get(String.format(PAGE_URL, baseUrl));
    }

    @Override
    public boolean isOpened() {
        boolean isUrlCorrect = String.format(PAGE_URL, baseUrl).equals(driverProvider.getInstance().getCurrentUrl());
        boolean isHeaderCorrect = PAGE_HEADER.equals(header.getText());
        return isUrlCorrect && isHeaderCorrect;
    }

    @Override
    public void waitUntilPageOpened() {
        waiter.waitUntilExpected(webDriver -> isOpened(), DEFAULT_TIMEOUT_5_000_MS);
    }
}
