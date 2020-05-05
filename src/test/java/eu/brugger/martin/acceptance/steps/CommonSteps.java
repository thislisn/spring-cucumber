package eu.brugger.martin.acceptance.steps;

import eu.brugger.martin.acceptance.TestConfiguration;
import io.cucumber.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfiguration.class)
public class CommonSteps implements En {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonSteps.class);

    public CommonSteps() {

    }
}
