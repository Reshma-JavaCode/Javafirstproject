package com.arrays;

import java.util.Scanner;
//WAP to Find Even numbers in an array
public class EvenNumbersInArray {

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
		System.out.println("\neven numbers in an array are: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] %2==0) {
				System.out.print(num[i]+" ");
			}
			}
	}

}
