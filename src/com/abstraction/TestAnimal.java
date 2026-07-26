package com.abstraction;

public class TestAnimal {
	//final int age; CE
	
	public static void main(String[] args) {

		TestAnimal t=new TestAnimal();
		//t.age=10; CE
		
		Animal a;
		
		System.out.println("********Dog Info********");
		a=new Dog();
		a.sound();
		a.eat();
		a.breath();
		
		System.out.println("\n********Cat Info********");
		a=new Cat();
		a.sound();
		a.eat();
		
		a.breath();			
		//or
		//Cat c=new Cat();
		//c.breath();
		
		//a.common();//CE : This static method of interface Animal can only be accessed as Animal.common
		//Static methods belong to the interface itself, 
		//so they are not inherited by implementing classes.
		//we can't override static methods*
		//static methods called by using interface name only not with objects
		//since static belongs to class not object
		Animal.common();
		
		System.out.println("\nOrganization name: "+Animal.orgName);
	}

}
