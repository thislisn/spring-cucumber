package eu.brugger.martin.acceptance.steps;

import cucumber.api.java8.En;
import eu.brugger.martin.acceptance.framework.page.HomePage;
import eu.brugger.martin.acceptance.framework.page.SearchResultsPage;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.naming.directory.SearchResult;

public class SearchResultsSteps implements En {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchResultsSteps.class);

    @Autowired
    SearchResultsPage searchResultsPage;

    public SearchResultsSteps() {
        When("^I wait for Search Results page loaded$", () -> {
            searchResultsPage.waitUntilPageOpened();
        });

        Then("^I check that Search results page is opened$", () -> {
            Assert.assertTrue("Search results page is not opened", searchResultsPage.isOpened());
        });

        Then("^I check that header name is \"?([^\"]*)\"?$", (String headerName) -> {
            Assert.assertEquals("Header name is not as expected on Search Results page", searchResultsPage.getPageHeaderText(), headerName);
        });
    }


}
