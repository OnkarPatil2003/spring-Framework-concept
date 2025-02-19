package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(Appconfig.class);
		Car c1 = (Car) capp.getBean("car");
		
		c1.display();
		
		
	}

}
