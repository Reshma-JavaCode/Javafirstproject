package com.accessmodifiers01;

//Default accessmodifiers:
//Scope: within class and within pckg
public class DefaultClass {

	int id=101;
	String name="Reshma";
	
	DefaultClass()
	{
		System.out.println("default-no arg constructor");
	}
	
	void defaultMethod()
	{
		System.out.println("Default method");
	}
	
	public static void main(String[] args) {

		DefaultClass d=new DefaultClass();
		
		System.out.println("ID= "+d.id);
		System.out.println("Name= "+d.name);
		d.defaultMethod();
		
	}

}
