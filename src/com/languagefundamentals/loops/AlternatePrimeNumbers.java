package com.languagefundamentals.loops;

import java.util.Scanner;

public class AlternatePrimeNumbers {

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

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter starting number");
		int s= sc.nextInt();
		System.out.println("Enter End number");
		int e= sc.nextInt();
		int count=0;
		for(int i=s;i<=e;i++)
		{
			if(isPrime(i))
			{
				count++;
				if(count%2!=0)
					System.out.print(i+" ");
			}
		}
	}

}
