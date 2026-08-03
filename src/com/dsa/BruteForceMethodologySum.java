package com.dsa;

import java.util.Scanner;


//TC: O(n*n)
public class BruteForceMethodologySum {

	public static void main(String[] args) {

		int a[] = { 5, 6, 7, 8, 9, 10, 11 };

		System.out.println("Enter target value:");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println("Pairs found: ");
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
		sc.close();

	}

}
