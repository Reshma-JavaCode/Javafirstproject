package com.myfirstpckg;

public class Test {
	
	public static void show()
	{
		//static data access w/o object creation
		//instance data access possible by using object only
		//instance method can allow static + instance methods in it
		//static method won't allow instance data directly
		//to call instance methods in static method need objct creation in static method.
		//Test t=new Test();
		//t.display();
		show2();
		System.out.println("show method called"); 
		
	}
	static void show2()
	{
		System.out.println("show2 method called"); 
		
	}
	void disp2()
	{
		System.out.println("disp2 method called"); 	
	}
	public static void main(String[] args) {
		System.out.println("Main method started"); 
		//show();
		Test t=new Test();
	    t.display();		
	}

	public void display()
	{
		disp2();
		show();
		System.out.println("display method called"); 
		
	}
}
