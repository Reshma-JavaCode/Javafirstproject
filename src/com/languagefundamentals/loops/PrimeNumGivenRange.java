package com.languagefundamentals.loops;

import java.util.Scanner;

public class PrimeNumGivenRange {

	public static boolean isPrime(int n)
	{
		//boolean status=true;
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
				//break;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {

		System.out.println("main method started!!!");
		System.out.println("Enter range:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
		if(isPrime(i))
		{
			System.out.print(i+" ");
		}
		}
		
	}

}
