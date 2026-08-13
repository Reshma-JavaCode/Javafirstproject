package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double final_price=0;
		boolean success=false;
		
		try {
		System.out.println("Enter product price:");
		double price=sc.nextDouble();
		
		double discout=0.5;
		final_price= price-(price*discout);
		success=true;
		}
		
		catch(InputMismatchException e)
		{

		    System.err.println("Invalid input! Please enter a number.");
		    System.out.println(e.toString());
			//e.printStackTrace();
			//System.exit(0); //to stop finally block execution
		    //if exception occurs..
		}
		
		finally
		{
			if(success)
				System.out.println("Final Price= "+final_price);
			
			System.out.println("Shopping completed");
		}
		
		sc.close();
		
	}

}
