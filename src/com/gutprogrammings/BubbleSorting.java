package com.gutprogrammings;

import java.util.Arrays;

/*
 * 1. Given an unsorted array of integers, sort the array in ascending order using the Bubble Sort algorithm.
 * Example:
 * Input:
 * arr = [5, 3, 8, 4, 2]
 * Output:
 *[2, 3, 4, 5, 8]
 *Constraint:
 *Use Bubble Sort
 *Do not use built-in sort methods
 */
//swapped works here, if array values in asc order then no need of comparision 
//so,after 1st iteration it stops
/*
 * swapped helps us stop early when the array is already sorted.O(n)
 * But if the array is in reverse order, swapping is required in every pass.
 * Therefore, the worst-case complexity remains O(n²).
 */
/*
 * Case	:                 Time Complexity
 Best case (already sorted)   	O(n)
 Average case	                O(n²)
 Worst case (reverse sorted)	    O(n²)
 */

public class BubbleSorting {

	public static void main(String[] args) {

		int a[]= {5,3,8,4,2};
		System.out.println("Before Sorting :" +Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			boolean swapped= false;
			
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped= true;
				}
			}
			
			if(!swapped) //breaks unnecessary iterations
				break;					
		}
		System.out.println("\nAfter Sorting :" +Arrays.toString(a));//[2, 3, 4, 5, 8]
	}

}
