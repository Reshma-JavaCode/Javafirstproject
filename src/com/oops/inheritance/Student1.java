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
	
//	@Override
//	double show()
//	{
//		return 10;
//	}  CE: we can't override by different return type 
	//return type must be same for primitive DT
	
	private void disp1()
	{
		System.out.println("private disp1 from child");
	}
	
	
	static void disp3()
	{
		System.out.println("Static method from Child");
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
        
        s.disp1();
		s.disp3();
        
        Person1 s2=new Student1();
       // s2.disp1();//CE: since private can't access directly in other classes
        s2.disp2();//we can access like this
        s2.disp3();
		
	}

}
