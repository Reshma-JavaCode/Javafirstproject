package com.gutprogrammings;

/*
 * 1. Given an unsorted array of integers, sort the array in ascending order using the Selection Sort algorithm.
 * Example:
 * Input:
 * arr = [64, 25, 12, 22, 11]
 * Output:
 * [11, 12, 22, 25, 64]
 * Constraint:
 * Use Selection Sort
 * Do not use Collections.sort() or Arrays.sort()
 */
public class SelectionSort {

	public static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int minIndex=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[minIndex]>a[j])
				{
					minIndex=j;//4
				}
			}
			
			//swapping to get small value first
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
			
		}	
	}
	
	public static void main(String[] args) {

		int a[]= {64,25,12,22,11};
		
		System.out.println("Before Selection Sort, Array values are:");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		selectionSort(a);
		
		System.out.println("\n\nAfter Selection Sort, Array values are:");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

}
