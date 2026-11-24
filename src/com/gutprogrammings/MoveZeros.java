package com.gutprogrammings;

import java.util.Arrays;

// Given an array, move all zeros to the end while maintaining the order of non-zero elements.

/*
 * Example:
 * Input:
 * arr = [0, 1, 0, 3, 12]
 * Output:
 * [1, 3, 12, 0, 0]
 * Constraint:
 * In-place solution preferred
 * Time Complexity: O(n)
 */
public class MoveZeros {

	public static void moveAllZerosToEnd(int[] a)
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]= a[j];
				a[j]= temp;
				j++;
			}
		}
	}
	public static void main(String[] args) {

		int[] a= {0, 1, 0, 3, 12};
		
		moveAllZerosToEnd(a);
		
		System.out.println(Arrays.toString(a));
	}

}
