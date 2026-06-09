package com.languagefundamentals.loops;

import java.util.Scanner;

//WAP to Find all factors of a number.
//ex 6- 1,2,3,6
public class FactorsOfNumber {

	static void factors(int n) {
		System.out.println("Factors of " + n + " are: ");
		int i;
		for (i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it's Factors: ");
		n = sc.nextInt();
		factors(n);
	}
}
