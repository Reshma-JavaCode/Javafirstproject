package com.practice;

public class Test1 {

	{
		System.out.println("instance block");
	}
	
	Test1()
	{
		System.out.println("No arg constructor");
	}
	
	static int id=100;
	
	static void method(int id)
	{
		//this.id=id; //CE: Cannot use this in a static context
	}
	
	public static void main(String[] args) {
		
		method(102);
		
				
		//System.out.println(new Test1());
		System.out.println(new Test1().toString());
		}

//	instance block
//	No arg constructor
//	com.practice.Test1@2b2fa4f7

}
