package com.myfirstpckg;

public class Apr_20 {
	
	//to call instance block by using static object
	//static Apr_20 a=new Apr_20();
	//execution consider static order 	
	static
	{
		System.out.println("static method ");
		Apr_20 a=new Apr_20();
		//a.method1();
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method loaded");
		//when we create object it gng to call instance block
		//Apr_20 a=new Apr_20(); 
	}
	//void method1()
	{
		//object creation in instance block won't execute this block 
		//but if u create static object + below object in
		//instance block will leads to stackoverflowError
		//
		//Apr_20 a=new Apr_20();
		System.out.println("instance method");
		
	}
	

}

