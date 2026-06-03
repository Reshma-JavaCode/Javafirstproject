package com.operators;

public class LogicalOperators {

	
	public static void main(String[] args) {
		int a=10,b=20,c=20;
		
		System.out.println("**********Logical AND*************");
		//The operator && is undefined for the argument type(s) int, int
		//System.out.println(1&&1);
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		
		//Logical OP works only with conditions
		System.out.println((a<b)&&(b==c));
		System.out.println((a>b)&&(b==c));
		System.out.println((a<b)&&(b>c));
		System.out.println((a<b)&&(b<c));
		
		System.out.println("**********Logical OR*************");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println((a<b)||(b==c));
		System.out.println((a>b)||(b==c));
		System.out.println((a<b)||(b>c));
		System.out.println((a<b)||(b<c));
		
		System.out.println("**********Logical not*************");
		System.out.println(!(a<b));
	}

}
