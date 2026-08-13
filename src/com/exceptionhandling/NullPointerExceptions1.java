package com.exceptionhandling;

import java.util.Scanner;

public class NullPointerExceptions1 {

	public static void main(String[] args) {

		System.out.println("main method started...");
		
		try {
		String s=null;
		System.out.println(s.charAt(0));
		}
		catch(NullPointerException e)
		{
			//exception name
			//description
			System.err.println(e.toString());
			//e.printStackTrace();
		}
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		try {
			System.out.println("Enter a:");
			a=sc.nextInt();
			System.out.println("Enter b:");
			b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
		
		System.out.println("main method ended!!!");
		sc.close();
	}

}
