package thirdspringpackage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	
// :: dependency Injection fild/variable , setter methods , constructor :: 
//	:: Post-construct annotation , pre-Destory annotation ::
	
//	@Value(value = "2")
	int idcard;
	
//	@Value(value = "Allen")
	String Name;
	
//	@Value(value = "2")
	public void Setid(int idcard) {
		this.idcard = idcard;
	}
//	@Value(value = "Allen")
	public void SetName(String Name) {
		this.Name = Name;
	}
	
	public Person( @Value(value = "2") int idcard , @Value(value = "Berry") String Name) {
		System.out.println("id card no. " + idcard);
		System.out.println("Name : " + Name);
	}
	
		public void speak() {
			System.out.println(" :: Hello there :: ");

		}
		
		public void display() {
			System.out.println(this.idcard +" "+  this.Name);
		}
		
		@PostConstruct
		public void postconst() {
			System.out.println("this is post-const here");
		}
		
		@PreDestroy
		public void preconst() {
			System.out.println("this is pre-destroy here");
		}
}
