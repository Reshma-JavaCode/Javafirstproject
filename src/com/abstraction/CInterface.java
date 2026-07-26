package com.abstraction;

public interface CInterface extends AInterface,BInterface{

	/*@Override
	default void show2() {
		// TODO Auto-generated method stub
		AInterface.super.show2();
	}
*/
	//void show();
	
	//not override just another method 
	//since, static methods we can't override
	static boolean isValid(int n)
	{
		return n>=0;
	}
}
