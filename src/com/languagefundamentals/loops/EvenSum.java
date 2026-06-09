package com.languagefundamentals.loops;

import java.util.Scanner;
//WAP to Find the sum of even numbers from 1 to N.
public class EvenSum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to find sum of even numbers: ");
		n= sc.nextInt();
		for(int i=0;i<=n;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("sum of "+n+" even numbers: "+sum);
	}

}
