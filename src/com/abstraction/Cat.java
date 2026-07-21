package com.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {

		System.out.println("\nMeow Meow !!!");
		
	}

	@Override
	public void eat() {

		System.out.println("\nCat eats rat !!! ");
		
	}

	@Override
	public void breath()
	{
		System.out.println();
		System.out.println("Org name: "+orgName);
		//or but better is below one
		System.out.println("Org name: "+Animal.orgName);
		
		System.out.println("Default method overrided from interface");
	}
}
