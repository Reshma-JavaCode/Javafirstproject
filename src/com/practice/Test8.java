package com.practice;


class Demo{
	int a=10;
	String s="Reshma";
	
	void show()
	{
		System.out.println("a= "+a);
		//System.out.println("Name= "+s);
	}
}

class Demo2
{
	//It points to null until an object is assigned.
	Demo d; // Only declaration, creates only a reference variable, not an object.

	//then it will give answer: Name= Reshma
	//Demo d=new Demo();
}

public class Test8 {

	public static void main(String[] args) {

		//Demo d=new Demo();
		//System.out.println(new Demo().s); Reshma
		//d.show();
		
		Demo2 d2=new Demo2();
		//System.out.println("Name= " +d2.d.s);
		//Runtime Error:
		//Exception in thread "main" java.lang.NullPointerException:
		//Cannot read field "s" because "d2.d" is null
		//at com.practice.Test8.main(Test8.java:28)
		
		System.out.println(d2.getClass());//class com.practice.Demo2
		System.out.println(d2.getClass().getName());
		System.out.println(d2.hashCode());
		System.out.println(d2.toString());
		//d2.d.show();
		
	}

}
