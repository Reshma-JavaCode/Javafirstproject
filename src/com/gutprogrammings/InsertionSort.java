package com.gutprogrammings;

import java.util.Arrays;

/*
 * 1. Given an array of integers, sort the array using Insertion Sort.
 * Example:
 * Input:
 * arr = [12, 11, 13, 5, 6]
 * Output:
 * [5, 6, 11, 12, 13]
 */

public class InsertionSort {
	
	public static void insertionSort(int[] a)
	{
		//Consider the first element as sorted.
		//Pick the next element as the key.
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			
			//Compare the key with the previous elements.
			while(j>=0 && a[j]>key )
			{
				//Shift greater elements one position to the right.
				a[j+1] = a[j];
			
				j--;
			}
			//Insert the key into its correct position.
			 a[j+1]=key;
		}
	}
	
public static void main(String[] args) {

	int a[]= {12,11,13,5,6};
	
	System.out.println("Before Insertion Sort, Array values are:");
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	
	insertionSort(a);
	
		/*for(int i=1;i<a.length;i++)
		{
			int key=a[i];//11, 13, 5 , a[4]=6
			int j=i-1;//0 j=1, j=2 ,j=3 a[3]=13
			
			//Comparing values with key
			while(j>=0 && a[j]>key )//12>11 , 12>13(F), 13>5(T), 12>5,11>5
			{
				a[j+1] = a[j];//a[1]=12  {12,12,1,5,6},a[3]=13 {11,12,13,13,6},a[2]=12{11,12,12,13,6},a[1]=11{11,11,12,13,6}
				
				j--;//-1 1>=0 looping 0>=0loop -1
			}
			 a[j+1]=key;//a[0]=11 {11,12,13,5,6}, a[2]=13, a[0]=5{5,11,12,13,6}
		}*/
		
	System.out.println("\n\nAfter Insertion Sort, Array values are:");
	
		System.out.println(Arrays.toString(a));
	}

}
