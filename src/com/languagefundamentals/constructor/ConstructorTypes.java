package com.languagefundamentals.constructor;

public class ConstructorTypes {

	//instance data
	int id;
	String name;
	
	ConstructorTypes()
	{
		id=90;
		name="Reshu";
		System.out.println("No args Constructor");
	}
	
	//Parameterized constructor
	ConstructorTypes(int id,String name)
	{
		System.out.println("Parameterized constructor called");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		//obj created by using no args constructor
		//since explicitly we provided no args constructor
		//if we not privide no args constructor then objct create by using default constructor
		ConstructorTypes obj1=new ConstructorTypes();
		obj1.display();
		
		ConstructorTypes obj2=new ConstructorTypes(99,"Vijaya");
		obj2.display();//it give 0 null
		//since,we haven't access local variables directly,
		//local variables works inside method only
		//to acces that local data we need to initialized local variable data with the help of  class level variables
		
		
		System.out.println("Main method Ended");
		
	}
	void display()
	{
		System.out.println(id+ " "+name+"\n");
	}
}
