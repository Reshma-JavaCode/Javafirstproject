package com.gutprogrammings;

/*
 * 2. Given an array of integers, find the second largest distinct element.
 * Example:
 * Input:
 * arr = [12, 45, 67, 23, 89, 54]
 * Output:
 * 67
 * Constraint:
 * Do not sort the array
 * Time Complexity: O(n)
 */
public class SecondLargestElement {

	public static void main(String[] args) {

		int[] a = { 12, 45, 67, 23, 89, 54};

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > first) {
				
				second = first;
				first = a[i];

			} else if (second != first && a[i] > second) {
				
				second = a[i];			
			}
		}

		if (second == Integer.MIN_VALUE)
			System.out.println("Second largest distict element not exists!!!");
		else
			System.out.println("Second largest  element:" + second);

	}

}
