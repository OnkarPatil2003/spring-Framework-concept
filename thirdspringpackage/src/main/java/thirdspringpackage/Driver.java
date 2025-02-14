package thirdspringpackage;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(Appconfig.class);
		
		Person p1 = (Person) capp.getBean("person");
		
		p1.speak();
//		p1.display();
		
		capp.close();

	}

}
