package eu.brugger.martin.acceptance.framework.page;

import eu.brugger.martin.acceptance.framework.Loadable;
import eu.brugger.martin.acceptance.framework.driver.DriverProvider;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasePage implements Loadable, Page {

    @Autowired
    protected DriverProvider driverProvider;
}
