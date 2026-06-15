package com.languagefundamentals.loops;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {

		int s,e,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Starting range");
		s= sc.nextInt();//10
		System.out.println("Enter End range");
		e= sc.nextInt();//30
		System.out.println("Prime Numbers: ");
		for(int i=s;i<=e;i++)
		{
		if(isPrime(i))
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		}
		System.out.println("sum= "+sum);
		}
	
	//to find Prime numbers 
		static boolean isPrime(int n)
		{
			boolean status=true;
			if(n<=1)
				status=false;
			for(int i=2;i<n;i++)
			{
				if(n%i==0) {
					status= false;
					break;
					}
				
			}
			return status;
		}
	}


