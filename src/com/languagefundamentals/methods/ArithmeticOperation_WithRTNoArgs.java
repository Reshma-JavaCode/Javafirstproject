package com.languagefundamentals.methods;

import java.util.Scanner;

public class ArithmeticOperation_WithRTNoArgs {

	static Scanner sc=new Scanner(System.in);
	int a,b;
	
	int add()
	{
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		int sum=a+b;
		return sum;
	}
	
	int sub()
	{
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		int sub=a-b;
		return sub;
	}
	static double multiply(int a,int b)
	{
		double mul=a*b;
		return mul;
	}
	 	
	
	public static void main(String[] args) {
		ArithmeticOperation_WithRTNoArgs  obj=new ArithmeticOperation_WithRTNoArgs();
		int sum=obj.add();
		System.out.println("sum = "+sum);
		int sub=obj.sub();
		
		System.out.println("sub = "+sub);
		
		double d=multiply(100,200);
		System.out.println("mul = "+d);	
		
		
	}

}
