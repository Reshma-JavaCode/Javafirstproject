package com.languagefundamentals.loops;

import java.util.Scanner;
////Q) Decimal To Binary
public class DecimalToBinary {

	static void toBinary(int n)
	{
		int rem=0;
		String binary="";
		while(n>0)
		{
			rem=n%2;
			n=n/2;
			binary=rem+binary;
		}
		System.out.println(binary);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();//10
		toBinary(n);
		
	}

}
