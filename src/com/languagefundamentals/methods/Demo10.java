package com.languagefundamentals.methods;

import java.util.Scanner;

public class Demo10 {
	static Scanner sc=new Scanner(System.in);
static void show() {
	System.out.println("hello");
}

static void show2(int x,int y)
{
	System.out.println("a value="+x);
	System.out.println("b value="+y);
	
}

static void add(int a,int b)
{
	int sum=a+b;
	System.out.println("sum= "+sum);
	System.out.println("sum= "+(a+b));
	
}

static int add2()
{
	
	System.out.println("Enter a value:");
	int a=sc.nextInt();
	System.out.println("Enter b value:");
	int b=sc.nextInt();
	
	int sum=a+b;
	
	return sum;
	//System.out.println("addition= "+sum);
}
	public static void main(String[] args) {
		
		show();
		//System.out.println();
		/*
		int sum=add2();
		System.out.println("addition of numbers="+sum);*/
		
		//square=s*s;
		
		System.out.println("Enter s value:");
		double s=sc.nextDouble();
		
		double a1=square(s);
		System.out.println("area of square: "+a1);
	}
	
	static double square(double s)
	{
		double area=s*s;
		String f=String.format("%.2f",area);
		return area;
		
	}

}
