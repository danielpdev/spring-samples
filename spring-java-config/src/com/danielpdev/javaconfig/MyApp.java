package com.danielpdev.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalsConfig.class);
		
		Animal dog = context.getBean("dog", Animal.class);
		Animal cat = context.getBean("cat", Animal.class); //defined by a java method, without Annotations
		
		System.out.println(dog.getYears());
		System.out.println(cat.getYears());
		System.out.println(cat.makeNoise());
		
		System.out.println(((Dog)dog).getPrice()); 
		context.close();
	}

}
