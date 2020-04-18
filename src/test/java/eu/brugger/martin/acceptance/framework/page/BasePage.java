package eu.brugger.martin.acceptance.framework.page;

import eu.brugger.martin.acceptance.framework.Loadable;
import eu.brugger.martin.acceptance.framework.driver.DriverProvider;
import eu.brugger.martin.acceptance.framework.utils.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class BasePage implements Loadable, Page {
    @Autowired
    protected DriverProvider driverProvider;
    @Autowired
    protected Waiter waiter;

    @Value("${url.base}")
    protected String baseUrl;
}
