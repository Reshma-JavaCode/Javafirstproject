package com.arrays;

import java.util.Scanner;
//WAP to find Smallest number in array
public class MinNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Sz of an array:");
		int sz = sc.nextInt();

		int num[] = new int[sz];

		System.out.println("enter " + sz + " array values: ");
		for (int i = 0; i < sz; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Array values are: ");
		for (int n : num) {
			System.out.print(n + " ");
		}

		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("\nThe minimum number in a given array is : " + min);
		sc.close();
	}

}
