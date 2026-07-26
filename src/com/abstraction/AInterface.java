package com.abstraction;

public interface AInterface {

	
	void show();
	/*default void show2()
	{
		System.out.println("Default method from A interface");
	}
	*/
	void show3();
	
	//default methods
	public default void defMethod()
	{		
		System.out.println("Default method from A interface");
	}
	
	//static methods
	//common utility or functionality
	static boolean isValid(int n)
	{
		return n>=0;
	}
	
}
