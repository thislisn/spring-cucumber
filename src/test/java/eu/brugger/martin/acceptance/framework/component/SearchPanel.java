package eu.brugger.martin.acceptance.framework.component;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class SearchPanel extends BaseComponent {

    @FindBy(css = "input.header-search-input")
    WebElement searchInput;

    public void setSearchInput(String searchKey) {
        waiter.waitUntilWebElementDisplayed(searchInput);
        searchInput.sendKeys(searchKey);
        searchInput.sendKeys(Keys.ENTER);
    }

    public void submitSearchInput() {
        searchInput.sendKeys(Keys.ENTER);
    }
}
