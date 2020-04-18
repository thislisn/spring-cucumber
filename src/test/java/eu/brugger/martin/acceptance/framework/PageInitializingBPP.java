package eu.brugger.martin.acceptance.framework;

import eu.brugger.martin.acceptance.framework.driver.DriverProvider;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PageInitializingBPP implements BeanPostProcessor {

    @Autowired
    private DriverProvider driverProvider;

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if (o instanceof Loadable && !o.getClass().isAnnotationPresent(SkipInit.class)) {
            PageFactory.initElements(driverProvider.getInstance(), o);
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
