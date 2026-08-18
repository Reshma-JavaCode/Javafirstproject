package com.exceptionhandling;

import java.util.Scanner;

/*
 Q) Write a Java program to implement a login system using a custom exception.
Accept the username and password from the user.
If the credentials are incorrect, throw an InvalidCredentialsException.
Otherwise, display "Login Successful" and handle the exception using a try-catch block.
 */

public class CustomException2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name: ");
		String u=sc.nextLine();
		System.out.println("enter Password:");
		String pwd=sc.next();
		try {
		if(u.equalsIgnoreCase("Admin") && pwd.equals("Admin@123"))
		{
			System.out.println("Login Succesful");
		}
		else
		{
			throw new InvalidCredentialsException("Invalid Credentials!!!");
		}
		}
		catch(InvalidCredentialsException e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
		sc.close();
		}
	}

}
