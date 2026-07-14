package com.oops.inheritance;

public class Person {

	
	private void m1()
	{
		System.out.println("M1 private method from parent person");
	}
	
	
	static void m2()
	{
		System.out.println("M2 static method from Parent person");
	}
	
	
	final void m3()
	{
		
		System.out.println("Final method from parent class ");
	}
	
	
	//void hello();//CE: This method requires a body instead of a semicolon
	
	
	void eat()
	{
		System.out.println(">>To get Energy we must need to take food\n");
	}
	
	void sleep()
	{
		System.out.println(">>8 hours of sleep is mandatory for good health\n");
	}
	
}
