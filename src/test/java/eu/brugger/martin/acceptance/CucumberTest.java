package eu.brugger.martin.acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources"
        , glue = "eu.brugger.martin.acceptance.steps")
@ContextConfiguration(classes = TestConfiguration.class)
public class CucumberTest {
}
