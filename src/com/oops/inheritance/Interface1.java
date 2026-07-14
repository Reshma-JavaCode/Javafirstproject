package com.oops.inheritance;

public interface Interface1 {
	
	//CE: Interfaces cannot have constructors
	/*Interface1()
	{
		
	}*/
	
	static void m1() {
		System.out.println("static methods can't overide");
	}
	
	default void m2() {
		System.out.println("Default methods can't overide");
	}
	
}
