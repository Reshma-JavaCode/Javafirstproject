package com.gutprogrammings;
import java.util.Arrays;

/*
 * Time Complexity:
 
 * Best Case: O(n log n)
 * Average Case: O(n log n)
 * Worst Case: O(n²)
 */
public class QuickSort {
	
	public static int partition(int[] a,int low,int high)
	{
		int pivot= a[high], i=low-1;
		
		for(int j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				//swap
				int temp= a[i];
				a[i]= a[j];
				a[j]= temp;
			}
		}		
		//swap pivot element with large elements
		i++;
		int temp= a[i];
		a[i]= pivot;
		a[high]= temp;
		
		return i; //pivot index			
	}
	
	public static void quickSort(int[] a,int low,int high)
	{
		if(low<high)
		{
		int pivotIndex= partition(a,low,high);
		
		quickSort(a, low, pivotIndex-1);
		quickSort(a, pivotIndex+1, high);
		}
		
	}

	public static void main(String[] args) {

		int a[]= {6,5,3,2,1,7};
		
		System.out.println("Before Quick Sort, Array values are:");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}	
		quickSort(a, 0, a.length-1);
		
		System.out.println("\n\nAfter Quick Sort, Array values are:");
		System.out.println(Arrays.toString(a));
	}

}
