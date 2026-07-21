package com.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog Sounds Bow Bow !!!");
	}

	@Override
	public void eat() {
		System.out.println("Dog Eats Non-veg !!!");
	}

	
	
}
