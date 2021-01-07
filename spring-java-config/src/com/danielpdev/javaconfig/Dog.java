package com.danielpdev.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
	@Value("${food.price}") //using properties file
	private String price;
	
	@Override
	public Number getYears() {
		return 21;
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getPrice() {
		return price;
	}

}
