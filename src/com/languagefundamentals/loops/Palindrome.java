package com.languagefundamentals.loops;

import java.util.Scanner;

//WAP to Check whether a number is a palindrome.
public class Palindrome {

	public static void main(String[] args) {

		int n, temp, rem, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		n = sc.nextInt();
		temp = n;
		for (int i = n; i > 0; i = i / 10) {
			rem = i % 10;
			rev = (rev * 10) + rem;
		}
		if (temp == rev) {
			System.out.println(n + " is polindrome");
		} else
			System.out.println(n + " is not a polindrome");

	}

}
