package com.languagefundamentals.loops;

import java.util.Scanner;
//Print the multiplication table of a given number.
public class MultiplicationTable {

	public static void main(String[] args) {

		int n,mul=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to do multiplication: ");
		n= sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}

}
