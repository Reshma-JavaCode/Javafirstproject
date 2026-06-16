package com.languagefundamentals.loops;

import java.util.Scanner;

////Q) WAP to Swap 2 numbers using temporary variable
public class Swap1 {

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
		
		//Swapping
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after Swapping ");
		System.out.println("a value is: "+a);
		System.out.println("B value is: "+b);
		
	}

}
