package beanConcept;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {


	public static void main(String[] args) {
		
		ConfigurableApplicationContext capp = new AnnotationConfigApplicationContext(AppConfig.class);

/*	 Same ref to both variable to avoid it use @Scope(value = "prototype")
 * 	"singleton", "prototype", /"session", "Application", "Request"/
 */
		
		Person p1 = (Person) capp.getBean("person");
		Person p2 =(Person) capp.getBean("person");
		System.out.println(p1);
		System.out.println(p2);	

		p1.walk();
}
	
			
}
