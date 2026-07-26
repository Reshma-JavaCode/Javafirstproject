package com.abstraction;

public class Demo1Class implements AInterface,BInterface{

	@Override
	public void show() {
		
		System.out.println("Common method implemented by child class");
	}

	//Must need to implement if same default methods available in 2 interfaces
	/*@Override
	public void show2()
	{
		AInterface.super.show2();
		//or
		BInterface.super.show2();
		//or
		System.out.println("default method from child class");
	}
	*/
	@Override
	public void show3() {
		System.out.println("Show3 from child class");
	}
	
	public static void main(String[] atgs)
	{
		AInterface	a=new Demo1Class();
		System.out.println("Main method started..");
		a.show();
	//	a.show2();
		a.show3();
	}
}
