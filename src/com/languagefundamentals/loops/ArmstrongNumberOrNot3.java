package com.languagefundamentals.loops;

import java.util.Scanner;

////Q)Write a Java program to check whether a given number 
///is an Armstrong number or not
//// without using predefined methods 
////Input:153 Output:153 is an Armstrong Number
public class ArmstrongNumberOrNot3 {

	// To find Digits in a given number
	static int digitCount(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	// Armstrong Number Logic
	static boolean isArmstrong(int n, int digits) {
		boolean status = false;
		int rem = 0, sum = 0;
		int temp = n;
		int pow;
		while (n > 0)// 153 15 1 0
		{
			rem = n % 10;// 3 5 1
			pow = 1;// Mandatory to initialize here
			for (int i = 1; i <= digits; i++)// 1 2 3
			{
				pow = pow * rem;// 3*3*3 5*5*5 1*1*1
			}
			sum = sum + pow; // 27 125+27 125+27+1
			// Predefned method:- Math.pow(rem, digits)
			// sum=(int)(sum+(Math.pow(rem, digits)));
			n = n / 10;// 15 1 0
		}
		if (temp == sum)
			status = true;

		return status;
	}

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number");
		n = sc.nextInt();// 153
		
		int digits = digitCount(n);
		if (isArmstrong(n, digits))
			System.out.println(n + " is Armstrong number");
		else
			System.out.println(n + " not Armstrong number");

	}

}
