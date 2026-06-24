package com.arrays;

import java.util.Arrays;

////Q)WAP to to reverse of a given array

public class ReverseOrder {

	static void reverseOrder(int[] a) {
		int start = 0, end = a.length - 1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(a));

		reverseOrder(a);
		System.out.println("\nAfter Reversing, the array values are:");
		// System.out.println(Arrays.toString(a));
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
