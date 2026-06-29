package com.accessmodifiers01;

//Protected AM
//scope: within class + within pckg + 
//outside of packages of subclasses only

public class ProtectedAM {

	static {
		System.out.println("Protected static block");
	}
	
	{
		System.out.println("Protected Instance Block");
	}
	//private var
		protected int id=100;
		protected String name="Reshu";
		
		//private constructor
		//we can't create object for this class in another classes
		//since, constructor is private
		protected ProtectedAM()
		{
			System.out.println("Protected access modifier no arg constructor");
		}
		
		//private method
		protected void method()
		{
			System.out.println("Protected access modifier method");
		}

	
	public static void main(String[] args) {

			ProtectedAM p1= new ProtectedAM();
			
			System.out.println("Id= "+p1.id);
			System.out.println("Name: "+p1.name);
			p1.method();

			
		
	}

}
