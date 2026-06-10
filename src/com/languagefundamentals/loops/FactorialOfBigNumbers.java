package com.languagefundamentals.loops;

import java.util.Scanner;
import java.math.BigInteger;
//To find Factorial of big number like 13,33,35,60 etc 
//BigInteger
public class FactorialOfBigNumbers {

	static void numberFactorial(int n)
	{
		// fact=new BigInteger("1"); or
		BigInteger fact = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++) {
			//BigInteger.valueOf(i) converting i int to BigInteger
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial of " + n + " is= " + fact);

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		//calling method to write logic
		numberFactorial(n);
		
			}

}
