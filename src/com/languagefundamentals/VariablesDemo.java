package com.languagefundamentals;

public class VariablesDemo {
	
	static int college_id=111;
	static String college_Name="JNTU";
	
	int age;
	String name;
	 
	public static void main(String[] args) {
		
		VariablesDemo vd=new VariablesDemo();
		
		//Accessing static data in 3 ways
		System.out.println("Directly Accessing static data");
		System.out.println("College id: "+college_id);
		System.out.println("College name: "+college_Name+"\n");
		
		System.out.println("Accessing static data by using class");
		System.out.println("College id: "+VariablesDemo.college_id);
		System.out.println("College name: "+VariablesDemo.college_Name+"\n");
		
		System.out.println("Accessing static data with object");
		//accessing static data with objct ,objct doen't gng to impact static data
		//so,better way is access static with class name*****
		//The static field VariablesDemo.college_id should be accessed in a static way
		System.out.println("College id: "+vd.college_id);
		//The static field VariablesDemo.college_Name should be accessed in a static way
		System.out.println("College name: "+vd.college_Name+"\n");
		
		
		VariablesDemo vd2=new VariablesDemo();
		vd2=null;
		System.out.println("Here vd2 object doesn't impact on static dat so,no NullPointerException ");
		System.out.println("student age: "+vd2.college_id+"\n");
		
		
		//accessing instance variables 
		
		System.out.println("student age: "+vd.age);
		System.out.println("Student name: "+vd.name+"\n");
		
		//local variables
		int a=10;
		char c='p';
		 //Illegal modifier for parameter b; only final is permitted
		//static int b=9; local var shouldn't allow any modifiers ,
		//only it allows final keyword
		
		int college_id=999;
		System.out.println("local variables have 1st priority,if we have same var as static and local");

		System.out.println("so,local College id: "+college_id+"\n");
		System.out.println("to access static variables then use class name");
		System.out.println("static variable is: "+VariablesDemo.college_id);
		


	}

}
