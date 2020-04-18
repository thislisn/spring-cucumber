package eu.brugger.martin.acceptance;


import eu.brugger.martin.acceptance.framework.driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@Profile("chrome")
@ComponentScan(basePackages = {"eu.brugger.martin.acceptance"})
@PropertySource(value = "classpath:testconfig.properties")
public class TestConfiguration {

    @Autowired
    protected DriverProvider driverProvider;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(destroyMethod = "quit")
    public WebDriver getWebDriver() {
        return driverProvider.getInstance();
    }
}
