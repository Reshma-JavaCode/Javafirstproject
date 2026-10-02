package com.languagefundamentals.loops;

import java.util.Scanner;
////Q) Decimal To Binary
/// ex: 4---100, 2=10
public class DecimalToBinary {

	static void toBinary(int n)
	{
		int rem=0;
		String binary="";
		while(n>0)
		{
			rem=n%2;			
			binary=rem+binary;
			n=n/2;
		}
		System.out.println(binary);//100
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int n= sc.nextInt();//4
		toBinary(n);
		
	}

}
