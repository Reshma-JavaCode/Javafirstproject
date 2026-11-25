package com.gutprogrammings;

import java.util.Arrays;
// Given an array of integers, sort the array using Merge Sort.
public class MergeSort {
	
	public static void conquer(int[] a,int s,int mid,int e)
	{
		int indx1=s,indx2=mid+1;
		int sz= e-s+1;
		int[] merge=new int[sz];
		int x=0;
		
		while(indx1<=mid && indx2<=e)
		{
			if(a[indx1]<=a[indx2])
			{
				merge[x++]= a[indx1++];
			}
			else
				merge[x++]= a[indx2++];
		}
		
		while(indx1<=mid)
		{
			merge[x++]= a[indx1++];
		}
		while(indx2<=e)
		{
			merge[x++]= a[indx2++];
		}
		
		for(int i=0,j=s;i<merge.length;i++,j++)
		{
			a[j]=merge[i];
		}
	}

	public static void divide(int[] a,int s,int e)
	{
		if(s<e)
		{
			int mid= (s+e)/2;
			
			divide(a,s,mid);
			divide(a,mid+1,e);
			conquer(a,s,mid,e);
		}
	}
	
	public static void main(String[] args) {

		int[] a= {38,27,43,3,9,82,10};
		
		System.out.println("Before Sorting, Array values are:\n");
		System.out.println(Arrays.toString(a));
		
		divide(a,0,a.length-1);
		
		System.out.println("\n\nAfter Merge Sort, Array values are:\n");
		
		System.out.println(Arrays.toString(a));
	}

}
