package com.languagefundamentals.methods;

import java.util.Scanner;


public class MethodWithRT_WithArgs {
	
	int add(int s1,int s2)
	{
		int sum=s1+s2;
		return sum;
	}
	
	double subtract(double d,float f)
	{
		double sub=d-f;
		return sub;
	}
	
	double multiply(double d1,double d2)
	{
		double mul=d1*d2;
		return mul;
	}
	
	double divide(double d1,int i1) {
		double div= (d1/i1);
		return div;
	}
	
	public static void main(String[] args) 
	{
		MethodWithRT_WithArgs obj=new MethodWithRT_WithArgs();
		Scanner sc=new Scanner(System.in);
		int a,b;
		float f1,f2;
		double d1,d2;
		
		System.out.println("Enter first value to do addition");
		a=sc.nextInt();
		System.out.println("Enter second value to do addition");
		b=sc.nextInt();
		int sum=obj.add(a,b);
		System.out.println("Addition of 2 numbers is: "+sum);
		System.out.println("------------------------------------"+"\n");
		
		
		System.out.println("Enter first value to do Subtraction");
		d1=sc.nextDouble();
		System.out.println("Enter second value to do Subtraction");
		f1=sc.nextFloat();
		double sub=obj.subtract(d1,f1);
		System.out.println("Subtraction of 2 numbers is: "+sub);
		System.out.println("------------------------------------"+"\n");
		
		System.out.println("Enter first value to do Multiplication");
		d1=sc.nextDouble();
		System.out.println("Enter second value to do Multiplication");
		d2=sc.nextDouble();
		double mul=obj.multiply(d1,d2);
		System.out.println("Multiplication of 2 numbers is: "+mul);
		System.out.println("------------------------------------"+"\n");
		
		System.out.println("Enter first value to do Division");
		d1=sc.nextDouble();
		System.out.println("Enter second value to do Division");
		a=sc.nextInt();
		
		double div=obj.divide(d1,a);
		//to get 2 decimal point
		String formatted = String.format("%.2f", div);
		System.out.println("Division of 2 numbers is: "+formatted);
		
		//System.out.println("------------------------------------");
		
		
		
		
		
	}

}
