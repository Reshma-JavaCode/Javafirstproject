package com.arrays;

import java.util.Scanner;
//WAP to find Largest number in array
public class MaxNumberInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Sz of an array:");
		int sz = sc.nextInt();

		int num[] = new int[sz];

		System.out.println("enter " + sz + " array values: ");
		// **a for-each loop cannot store values into an array.
		// It is only used to read/access existing values.
		// for(int n : num) {
	    //   num = sc.nextInt();   // This does NOT store in the array
       //	}
		for (int i = 0; i < sz; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Array values are: ");
		for (int n : num) {
			System.out.print(n + " ");
		}

		int max = num[0];
		//System.out.println("Max= " + max);
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("\nThe maximum number in a given array is : " + max);
		sc.close();

	}

}
