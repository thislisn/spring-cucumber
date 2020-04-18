package eu.brugger.martin.acceptance.steps;

import cucumber.api.java8.En;
import eu.brugger.martin.acceptance.framework.page.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps implements En {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);

    @Autowired
    LoginPage loginPage;

    public LoginSteps() {
        Given("^I open Login page of Github$", () -> {
            loginPage.open();
        });
        When("^I sign in with default credentials on Login page of Github$", () -> {
            loginPage.signIn();
        });

        When("^I wait for Login page loaded$", () -> {
            loginPage.waitUntilPageOpened();
        });
    }


}
