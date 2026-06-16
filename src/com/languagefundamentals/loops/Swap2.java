package com.languagefundamentals.loops;

import java.util.Scanner;

public class Swap2 {
////Q)WAP to swap 2 numbers without temporary variable
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value: ");
		a=sc.nextInt();
		System.out.println("enter b value: ");
		b=sc.nextInt();
		System.out.println("Before Swapping ");
		System.out.println("a value is: "+a);
		System.out.println("B value is: "+b);
		
		//Swapping logic
		a=a+b;    //20+10=30  9+6=15
		b=a-b;    //30-10=20  15-6=9
		a=a-b;    //30-20=10  15-9=6
		System.out.println("after Swapping ");
		System.out.println("a value is: "+a);
		System.out.println("B value is: "+b);
		
	}

}
