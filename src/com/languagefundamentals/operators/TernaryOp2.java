package com.languagefundamentals.operators;

import java.util.Scanner;

//WAP to find greatest of 3 numbers using ternary operators
public class TernaryOp2 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 values to find greatest of 3 no.s");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		int max= (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
		System.out.println("greatest of 3 no.s is: "+max);
		
	}
}
