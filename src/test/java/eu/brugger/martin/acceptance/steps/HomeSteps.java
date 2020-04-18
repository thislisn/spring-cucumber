package eu.brugger.martin.acceptance.steps;

import cucumber.api.java8.En;
import eu.brugger.martin.acceptance.framework.page.HomePage;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps implements En {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeSteps.class);

    @Autowired
    HomePage homePage;

    public HomeSteps() {
        When("^I wait for Home page loaded$", () -> {
            homePage.waitUntilPageOpened();
        });

        Then("^I check that Home page is opened$", () -> {
            Assert.assertTrue("Home page is not opened", homePage.isOpened());
        });

        When("^I search for \"?([^\"]*)\"?$", (String searchKey) -> {
            homePage.searchAndSubmit(searchKey);
        });
    }


}
