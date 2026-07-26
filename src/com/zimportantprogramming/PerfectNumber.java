package com.zimportantprogramming;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number:");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}

		if(sum==n)
		{
			System.out.println(n+" is perfect num");
		}
		else
			System.out.println(n+" is not a perfect number");
		sc.close();
	}

}
