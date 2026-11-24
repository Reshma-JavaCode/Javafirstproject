package com.gutprogrammings;
// Given an array of integers, reverse the array without using another array.
public class ReverseArray {
	
	public static void reverse(int[] a,int s,int e)
	{
		while(s<=e)
		{
			int temp=a[s];
			a[s]=a[e];
			a[e]=temp;
			
			s++;
			e--;
		}
	}

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		
		reverse(a,0,a.length-1);
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

}
