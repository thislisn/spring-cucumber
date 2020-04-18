package eu.brugger.martin.acceptance.framework.page;

import eu.brugger.martin.acceptance.framework.component.SearchPanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static eu.brugger.martin.acceptance.framework.utils.Waiter.TimeOutConstants.DEFAULT_TIMEOUT_5_000_MS;

@Component
public class SearchResultsPage extends BasePage {

    private String PAGE_URL = "%s/search";
    private static final String PAGE_HEADER = "repository results";
    public static final String PAGE_IDENTIFIER = "repository results";

    @FindBy(css = ".codesearch-results h3")
    WebElement header;

    @Autowired
    SearchPanel searchPanel;

    @Override
    public void open() {
        driverProvider.getInstance().get(String.format(PAGE_URL, baseUrl));
    }

    @Override
    public boolean isOpened() {
        boolean isUrlCorrect = driverProvider.getInstance().getCurrentUrl().contains(String.format(PAGE_URL, baseUrl));
        boolean isHeaderCorrect = header.getText().contains(PAGE_HEADER);
        return isUrlCorrect && isHeaderCorrect;
    }

    @Override
    public void waitUntilPageOpened() {
        waiter.waitUntilExpected(webDriver -> isOpened(), DEFAULT_TIMEOUT_5_000_MS);
    }

    public String getPageHeaderText(){
        return header.getText();
    }

}
