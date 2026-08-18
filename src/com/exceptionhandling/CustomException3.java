package com.exceptionhandling;


import java.util.Scanner;

/*
 Q) Create a custom exception named WeakPasswordException.

Write a Java program to validate a user's password using Regular Expressions (Regex).

The password must satisfy the following conditions:

Password length must be at least 8 characters.
Password must contain at least one digit (0-9).

If any condition is not satisfied, throw a custom exception WeakPasswordException with an appropriate message.

Otherwise, display:

Password is Strong
 */


public class CustomException3 {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		 {
			System.out.println("enter Password:");
			String pwd=sc.next();
		/*
			  if (pwd.matches("^(?=.*\\d).{8,}$"))
			{
				System.out.println("Password is strong");
			}
			else
				throw new WeakPasswordException("Weak Password!");*/
			
			if (pwd.length() < 8) {
			    throw new WeakPasswordException(
			        "Password must contain at least 8 characters"
			    );
			}

			if (!pwd.matches(".*\\d.*")) {
			    throw new WeakPasswordException(
			        "Password must contain at least one digit"
			    );
			}

			System.out.println("Password is Strong");
		}
		catch(WeakPasswordException e)
		{
			//e.printStackTrace();
			System.err.println(e.toString());
		}
		
		
	}

}
