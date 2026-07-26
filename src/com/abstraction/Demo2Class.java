package com.abstraction;

public class Demo2Class implements CInterface {

	static boolean isValid(int n)
	{
		return n>=0;
	}
	
	public static void main(String[] args) {
		
		//Demo2Class obj=new Demo2Class();
		//in normal classes we can access static methods using obj but
		//doen't gng to impact on it
		System.out.println("Main method static method:"+isValid(9));
		
		CInterface d=new Demo2Class();
		d.show();
		d.show3();
		
		//d.isValid(5); CE:This static method of interface CInterface
		//can only be accessed as CInterface.isValid
		
		//AInterface.defMethod();//CE: Cannot make a static reference to the
		//non-static method defMethod() from the type AInterface
		
		
		//static methods called only by using classnames
		System.out.println(AInterface.isValid(10));//true
		System.out.println(AInterface.isValid(-10));//false
	}

	@Override
	public void show3() {
		System.out.println("Show3 from child class");
	}

	@Override
	public void show() {
		System.out.println("Show from child class");
	}

}
