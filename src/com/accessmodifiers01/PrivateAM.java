package com.accessmodifiers01;

//Private access modifiers
//scope: within the class only

public class PrivateAM {

	//private var
	private int id=100;
	private String name="Reshu";
	
	//private constructor
	//we can't create object for this class in another classes
	//since, constructor is private
	private PrivateAM()
	{
		System.out.println("Private access modifier no arg constructor");
	}
	
	//private method
	private void method()
	{
		System.out.println("Private access modifier method");
	}
	
	public static void main(String[] args) {

		PrivateAM p=new PrivateAM();
		
		System.out.println("Id: "+p.id);
		System.out.println("Name: "+p.name);
		
		p.method();
	}

}
