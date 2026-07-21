package com.oops.inheritance;

public class Person1 {

	String name;
	int age;
	
	 // Method to display Person details
	void displayDetails()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student Age: "+age);
	
	}
	
	int show()
	{
		return 10;
	}
	
	private void disp1()
	{
		System.out.println("private disp1 from parent");
	}
	
	public void disp2()
	{
		disp1();
	}
	
	static void disp3()
	{
		System.out.println("Static method from parent");
	}
}
