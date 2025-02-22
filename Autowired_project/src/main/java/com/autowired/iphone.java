package com.autowired;

import org.springframework.stereotype.Component;

@Component
public class iphone implements Mobile{
	
@Override
public void call() {
	System.out.println("calling from Iphone");
}
	
}
