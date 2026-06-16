package com.languagefundamentals.loops;

import java.util.Scanner;

public class PrimeNumber2 {

	static boolean isPrime(int n)
	{
		boolean status=true;
		
		if(n<=1)
		{
			status= false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				status=false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		
		int n=15;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		n= sc.nextInt();
		boolean status=isPrime(n);
		if(status)
		System.out.println("is prime");
		else
			System.out.println("is not prime");
		sc.close();
			}
	

}
