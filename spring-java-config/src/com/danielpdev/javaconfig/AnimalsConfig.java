package com.danielpdev.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.danielpdev.javaconfig")
@PropertySource("classpath:animals.properties")
public class AnimalsConfig {

	
	@Bean
	public RandomSound catSound() {
		return new CatSound();
	}
	
	@Bean
	public Animal cat() {
		return new Cat(catSound());
	}
}
