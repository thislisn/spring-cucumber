package eu.brugger.martin.acceptance.framework.component;

import eu.brugger.martin.acceptance.framework.Loadable;
import eu.brugger.martin.acceptance.framework.driver.DriverProvider;
import eu.brugger.martin.acceptance.framework.utils.Waiter;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseComponent implements Loadable, Component {
    @Autowired
    protected DriverProvider driverProvider;
    @Autowired
    protected Waiter waiter;
}
