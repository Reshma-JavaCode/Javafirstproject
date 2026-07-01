package com.oops.inheritance;

public class Student extends Person{

	int rollNo=100;
	String name="Reshma";
	
	void study()
	{
		System.out.println(">>Student need study well, to achieve goals\n");
	}
	
	public static void main(String[] args) {

		Student s= new Student();
		
		s.eat();
		s.sleep();
		s.study();
		System.out.println("Id= "+s.rollNo);
		System.out.println("Name= "+s.name);
		
		
	}

}
