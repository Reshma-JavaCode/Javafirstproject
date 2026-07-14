package com.oops.inheritance;


//1.Write a java program to demonostrate inheritence Create a parent class Person with fields name and age, and a method displayDetails().
//->Create a child class Student that extends Person and adds a field rollNo.
//->Add a method displayStudentInfo() in Student.
//->Create a Student object and initialize all values.
//Display both person and student details using inherited and child class methods.

public class Student1 extends Person1{

	int rollNo;
	
	 // Method to display student details
	void displayStudentInfo()
	{	
		System.out.println("Student Roll Number: "+rollNo);
	}
	
	public static void main(String[] args) {

		Student1 s=new Student1();
		
		
		// Initializing inherited fields
        s.name = "Reshma";
        s.age = 23;

        // Initializing child class field
        s.rollNo = 101;

        // Calling inherited method
        s.displayDetails();

        // Calling child class method
        s.displayStudentInfo();
		
		
	}

}
