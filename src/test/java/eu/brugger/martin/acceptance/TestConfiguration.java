package eu.brugger.martin.acceptance;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"eu.brugger.martin.acceptance"})
@PropertySource(value = "classpath:testconfig.properties")
public class TestConfiguration {
}
