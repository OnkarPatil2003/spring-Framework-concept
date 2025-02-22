package com.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Motorola implements Mobile {

	@Override
	public void call() {
		System.out.println("calling from Motorola");
		
	}
}
