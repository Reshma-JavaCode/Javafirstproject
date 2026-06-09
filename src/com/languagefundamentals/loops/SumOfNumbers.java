package com.languagefundamentals.loops;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to find sum of a first n natural numbers: ");
		n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+= i;
		}
		System.out.println("sum of "+n+" natural numbers= "+sum);
	}

}
