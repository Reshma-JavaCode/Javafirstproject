package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args)throws ArithmeticException {

		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter a value:");
			int a=sc.nextInt();
			System.out.println("Enter a value:");
			int b=sc.nextInt();
		  System.out.println(a / b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		catch(NullPointerException e)
		{
		    System.out.println("NPE");
		}
		//java.util.InputMismatchException
		catch(InputMismatchException e)
		{
		    System.out.println("NPE");
		}
		
		
		//int a=10/0;
	}

}
