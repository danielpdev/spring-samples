package com.danielpdev.javaconfig;

public class Cat implements Animal {

	
	private RandomSound randomSound;

	public Cat(RandomSound randomSound) {
		this.randomSound = randomSound;
	}
	
	
	@Override
	public Number getYears() {
		return 22;
	}
	
	public String makeNoise() {
		return this.randomSound.getSoundName();
	}

}
