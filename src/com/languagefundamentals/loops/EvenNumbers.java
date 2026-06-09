package com.languagefundamentals.loops;

import java.util.Scanner;
//WAP to Print all even numbers AND
//Print all odd numbers from 1 to 100.
public class EvenNumbers {

	public static void main(String[] args) {

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a range to find even numbers: ");
		n= sc.nextInt();
		
		System.out.println("Even numbers: ");
		for(int i=0;i<=n;i=i+2)
		{
			//if(i%2==0)
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Odd numbers: ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			System.out.print(i+" ");
		}
		
	}

}
