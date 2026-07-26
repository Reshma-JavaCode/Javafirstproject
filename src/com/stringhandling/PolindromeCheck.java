package com.stringhandling;

import java.util.Scanner;

public class PolindromeCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s= sc.nextLine();
		String rev="";
		
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			rev= c+rev;
		}
		
		System.out.println("Reverse of a string is: "+rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Given String is polindrome");
		}
		else
			System.out.println("Not a polindrome");
	}

}
