package com.languagefundamentals.loops;

import java.util.Scanner;

public class RecursionEvenOdd {
	static boolean isEven(int n)
	{
		if(n==0)
			return true;
		if(n==1)
			return false;
		return isEven(n-2);
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		if(isEven(n))
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
		sc.close();
	}

}
