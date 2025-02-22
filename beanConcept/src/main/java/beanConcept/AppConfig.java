package beanConcept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "beanConcept")
public class AppConfig {

	@Bean
	@Scope( value = "prototype")
	public Person person() {
		return new Person();
	}
}
