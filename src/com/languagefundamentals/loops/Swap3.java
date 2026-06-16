package com.languagefundamentals.loops;

import java.util.Scanner;

public class Swap3 {
////Q)WAP to swap 2 numbers using Bitwise operators
	public static void main(String[] args) {
		int a,b;//10 20
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value: ");
		a=sc.nextInt();
		System.out.println("enter b value: ");
		b=sc.nextInt();
		System.out.println("Before Swapping ");
		System.out.println("a value is: "+a);
		System.out.println("B value is: "+b);
		
		//Swapping logic
		/*
		 * Logic of XOR(^):-  
		 *   a^a=0 
		 *   a^0=0 
		 */
		
		a=a^b; //10^20
		b=a^b; 
		//(10^20)^20 =
		//=(20^20)=0 
		//=10^0=10
		a=a^b;
		//10^20^(10)=
		//=10^10=0
		//20^0=20
		System.out.println();
		System.out.println("after Swapping ");
		System.out.println("a value is: "+a);
		System.out.println("B value is: "+b);
	}

}
