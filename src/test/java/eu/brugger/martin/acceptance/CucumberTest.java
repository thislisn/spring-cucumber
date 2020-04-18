package eu.brugger.martin.acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import eu.brugger.martin.acceptance.framework.CustomTestExecutionListener;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources"
        , glue = "eu.brugger.martin.acceptance.steps")
//@ContextConfiguration(classes = TestConfiguration.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, CustomTestExecutionListener.class})
public class CucumberTest {
}
