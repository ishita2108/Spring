package com.demo;

import org.springframework.stereotype.Component;

@Component(value="v2")  
public class Car implements Vehical{

	@Override
	public void move() {
		System.out.println("moving in a car");	
	}

}
