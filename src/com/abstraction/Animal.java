package com.abstraction;

public interface Animal {

	//Variables → Constants (public static final)
	//("Shared values that never change")
	public static final String orgName="VCubes";
	
	void sound();
	void eat();
	
	//private methods from 1.9 version
	//Private methods were introduced in Java 9 
	//to avoid code duplication between default and static methods
	private void message()
	{
		System.out.println("Common message....");
		System.out.println("project about animals...");
	}
	
	
	//default from 1.8ver
	//1Q) Is default an access modifier?
	  //here, default is  a keyword used only in interfaces to define a method 
		//with an implementation. 
	  //The access modifier is still public.
	
	//2Q) Why can we omit public?
		// Because every interface method is implicitly public. Therefore,
	public default void breath()
	{
		//System.out.println("Common message....");
		//System.out.println("project about animals...");

		message(); //accessing common msg using private methods
		System.out.println("Default method from interface ");
		System.out.println("every animal does breath");
	}
	
	//static methods from 1.8 version
	//To provide Constant behaviour
	public static void common()
	{
		//breath(); CE
		System.out.println("\nStatic method from interface");
	}
	
	
	//Testing interface methods (Most common use)
	//Suppose you have an interface with default and static methods.
	//You can quickly test the interface's static methods without creating another class.
	
	public static void main(String[] args)
	{
		
		System.out.println("Main method from interface");
		//Testing static methods working or not
		common();
		
		
	}
}
