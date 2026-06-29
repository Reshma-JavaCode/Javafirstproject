package com.accessmodifiers01;

//Public AM
//scope: within project anywhere->
//i.e, within class + within pckg + outside of the pckg

public class PublicAM {

	
	//Block scope is class scope only
	//if class public then block also public
	//But,we can't give access modifiers directly to blocks
	//it give error:
	//public static{}
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("Instance Block");
	}
	//private var
		public int id=100;
		public String name="Reshu";
		
		//private constructor
		//we can't create object for this class in another classes
		//since, constructor is private
		public PublicAM()
		{
			System.out.println("Public access modifier no arg constructor");
		}
		
		//private method
		public void method()
		{
			System.out.println("Public access modifier method");
		}
	
	public static void main(String[] args) {

		PublicAM p=new PublicAM();
		
		System.out.println("Id: "+p.id);
		System.out.println("Name: "+p.name);
		
		p.method();
	}

}
