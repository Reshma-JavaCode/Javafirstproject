package com.gutprogrammings;
/*
 *  2. Given an array of integers, find the third largest distinct element.
 * Example:
 * Input:
 * arr = { 10, 20, 4, 45, 99 };
 * Output:
 * 20
 * Constraint:
 * Do not sort the array
 * Time Complexity: O(n)
 
 */
public class ThirdLargestElement {

	public static void main(String[] args) {

		int[] a = { 10, 20, 4, 45, 99 };

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > first) {
				third = second;
				second = first;
				first = a[i];

			} else if (second != first && a[i] > second) {
				third = second;
				second = a[i];

			} else if (third != second && a[i] > third) {
				third = a[i];
			}
		}

		if (third == Integer.MIN_VALUE)
			System.out.println("Third largest distict element not exists!!!");
		else
			System.out.println("Third highest element:" + third);

	}

}
