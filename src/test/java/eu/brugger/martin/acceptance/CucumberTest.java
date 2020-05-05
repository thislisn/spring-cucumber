package eu.brugger.martin.acceptance;

import eu.brugger.martin.acceptance.framework.CustomTestExecutionListener;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources"
        , glue = "eu.brugger.martin.acceptance.steps")
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, CustomTestExecutionListener.class})
public class CucumberTest {
}
