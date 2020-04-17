package eu.brugger.martin.acceptance.steps;

import cucumber.api.java8.En;
import eu.brugger.martin.acceptance.TestConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfiguration.class)
public class CommonSteps implements En {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);
}
