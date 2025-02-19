package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value(value = "Lamborghini")
	String BrandName;
	@Value(value = "1000")
	int Mileage;
	@Autowired
	Engine engine;
	
	public void display() {
		System.out.println("Brandname : " + BrandName);
		System.out.println("Mileage : " + Mileage);
		System.out.println("Engine's CC : " + engine.cc);
	}
}
