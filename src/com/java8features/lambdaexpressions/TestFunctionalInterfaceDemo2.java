package com.java8features.lambdaexpressions;

interface in2
{
	int add(int a,int b);
}

public class TestFunctionalInterfaceDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started");
		
		in2 obj= (a,b)->{ 
			int sum = a+b;
			return sum;
		};
		
		System.out.println(obj.add(10, 2));
		
		
		System.out.println("main method ended");
	}
}
