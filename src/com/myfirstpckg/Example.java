package com.myfirstpckg;

public class Example {
   
	int a=10;
	static int b=20;
	static void show()
	{
		System.out.println("show1 method called"); 
		Example e=new Example();
		//e.disp1();
		
		System.out.println("a value= "+e.a); 
		System.out.println("b value= "+b); 
		
		e.disp2();
		
	}
	void disp1()
	{
		System.out.println("a value= "+a); 
		System.out.println("b value= "+b); 
		
		show();
		System.out.println("disp1 method called"); 	
	}
	void disp2()
	{
		//show();
		System.out.println("disp2 method called"); 	
	}
	/****************native methods**********/
	/*native meth doesn't provide body in java
	native void method1() {
		
	}*/
	
	//native method implementation provided by other languages like c/c++
	native void method1();
	
	
	public static void main(String[] args) {
		System.out.println("Main method started"); 
		//show();
		
		Example e=new Example();
		System.out.println("a value= "+e.a); 
		System.out.println("b value= "+b); 
		
		e.disp1();
		
		
	}

}
