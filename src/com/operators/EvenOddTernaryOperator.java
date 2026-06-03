package com.operators;

import java.util.Scanner;

//WAP to find the given no. is odd/even using ternary Operator
public class EvenOddTernaryOperator {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find even/odd");
		a= sc.nextInt();
		
		String res= (a%2==0)? "even" : "odd";
		System.out.println(a+" is : "+res);
		
		
	}

}
