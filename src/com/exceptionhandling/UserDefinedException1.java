package com.exceptionhandling;

import java.util.Scanner;

class InvalidAgeExceptio extends Exception
{
	public InvalidAgeExceptio(String msg) {
		super(msg);
	}
}

public class UserDefinedException1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		try {
			
		if(age<=18)
		{
			throw new InvalidAgeExceptio("Not eligible, your Age is below 18");
		}
		System.out.println("Eligible");
		}
		catch(InvalidAgeExceptio e)
		{
			e.getMessage();
		}
		finally {
		sc.close();
		}
	}

}
