package com.zimportantprogramming;

import java.util.Scanner;

public class PrimeNumberRange {

	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range to get Prime numbers:");
		int range= sc.nextInt();
		int count=0;
		
		for(int i=1;i<=range;i++)
		{
			boolean status = isPrime(i);
			if(status)
			{
				count++;
				System.out.println(i+" ");
			}
			
		}
		System.out.println("Total= "+count);
		sc.close();
	}

}
