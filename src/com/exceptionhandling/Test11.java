package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		try {
		System.out.println("Enter a value:");
		 a=sc.nextInt();
		System.out.println("Enter a value:");
		b=sc.nextInt();
		}
		catch(Throwable e)
		{
			System.err.println("Don't send zeros");
			e.printStackTrace();
		}
		//No exception of type Object can be thrown; 
		//an exception type must be a subclass of Throwable
//		catch(Object e)
//		{
//		    System.out.println("InputMismatchException");
//		    e.printStackTrace();
//		}
		
		
		try
		{
			
		  System.out.println(a / b);
		}
		catch(Exception e)
		{
			System.err.println("Don't send zeros");
			e.printStackTrace();
		}
		
		System.out.println("Ended");
	}

}
