package com.languagefundamentals.loops;

import java.util.Scanner;
//Find given number is Perfect number or not
public class PerfectNumber {

	void perfectNumber(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
			sum= sum+i;
			}
		}
		if(sum==n)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+" is not a perfect number");
	
	}
	public static void main(String[] args) {
		
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n= sc.nextInt();
		PerfectNumber obj= new PerfectNumber();
		obj.perfectNumber(n);
		}

}
