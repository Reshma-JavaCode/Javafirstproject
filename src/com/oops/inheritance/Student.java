package com.oops.inheritance;

public class Student extends Person{

	int rollNo=100;
	String name="Reshma";
	
	//private methods can't override
	//since, scope is within the class only
	//CE: @Override
	private void m1()
	{
		System.out.println("M1 private method from child student");
	}
	
	//static methods can't override. since, static belongs to class level
	//Method overriding is object level
	//CE: @Override
	static void m2()
	{
		System.out.println("M2 static method from Child person");
	}
	
	
	//CE: Cannot override the final method from Person
	/*final void m3()
	{
		System.out.println("Final method from Child class ");
	}*/
	
		
	void study()
	{
		System.out.println("\n>>Student need study well, to achieve goals\n");
	}
	
	public static void main(String[] args) {

		Student s= new Student();
		
		s.m1();//result: Child class method
		
		m2();		
		
		s.m3();//We can access final methods from parent to child but we can't override
		
		s.eat();
		s.sleep();
		s.study();
		System.out.println("Id= "+s.rollNo);
		System.out.println("Name= "+s.name);
		
		
	}

}
