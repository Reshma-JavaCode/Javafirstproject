package com.languagefundamentals.operators;

import java.util.Scanner;

public class LoginSystemUsingIfElse {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String uname,pwd;
		System.out.println("****** Welcome to Student Management System ********");
		System.out.println("");
		System.out.println("Enter  User Name: ");
		uname = sc.nextLine();
		System.out.println("Enter  Password: ");
		pwd = sc.nextLine();

		if(uname.equals("Reshma") && (pwd.equals("Reshma@123")))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed, Invalid credentials");
		System.out.println("Please enter correct credentials");
		}
	}

}
