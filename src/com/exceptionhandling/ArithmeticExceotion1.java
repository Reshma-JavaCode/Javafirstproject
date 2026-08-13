package com.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceotion1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("main method started");
		
		System.out.println("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		
		//if i give chars or string at a,b inputs:-
		//ex: if a=10.2/Abc/R then it throws exception called,
		//java.util.InputMismatchException
		
		System.out.println(a/b);
		//if, a/0:-
		//exception occurs it given name,description and location of the exception
		
		//Exception in thread "main"
		
		//Exception name: java.lang.ArithmeticException: 
		// Exception description: / by zero
		//Location: at com.exceptionhandling.ArithmeticExceotion1.main(ArithmeticExceotion1.java:18)

		
		System.out.println("main method ended");
	}

}
