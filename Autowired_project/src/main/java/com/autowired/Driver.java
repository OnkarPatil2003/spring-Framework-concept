package com.autowired;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(Appconfig.class);
		
/*
 * Autowired with class 
 *    - injecting value in the object when there is class
*/
//		Car c1 = (Car) capp.getBean("car");
//		c1.display();
//		capp.close(); 		// print after closing the application..
		
/* 		if two interface is there and to inject the object of which subclass is que?
 * 		- autowired with qualifer or mention primary annotation to subclass.
 * 		- qualifer is method level annotation and primary is class level annotation.
 * 
 */
		
//		Car c1 =(Car) capp.getBean("car");
//		c1.display();

	}

}
