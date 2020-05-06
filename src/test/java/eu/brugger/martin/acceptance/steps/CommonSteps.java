package eu.brugger.martin.acceptance.steps;

import eu.brugger.martin.acceptance.TestConfiguration;
import eu.brugger.martin.acceptance.framework.CustomTestExecutionListener;
import io.cucumber.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

@TestExecutionListeners(value = {DependencyInjectionTestExecutionListener.class,
        CustomTestExecutionListener.class, DirtiesContextTestExecutionListener.class})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@ContextConfiguration(classes = TestConfiguration.class)
public class CommonSteps implements En {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonSteps.class);

    public CommonSteps() {

    }
}
