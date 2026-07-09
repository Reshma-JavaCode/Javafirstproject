package com.arrays;

import java.util.Arrays;

//Two Pointer Technique.
//Time complexity: O(n + m)
public class MergeTwoArrays {

	public static void main(String[] args) {

		int a[]={1, 3, 5, 7};
		int b[]={2, 4, 6, 8};
		
		int n=a.length;
		int m=b.length;
		
		int sum=n+m;
		
		int[] res= new int[sum];
		
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				res[k]=a[i];
				i++;
			}
			else {
				res[k]=b[j];
				j++;
			}
			k++;
		}
		
		// Copy remaining elements of Array1
		while(i<a.length)
		{
			res[k]=a[i];
			i++;
			k++;
		}
		
		// Copy remaining elements of Array2
		while(j<b.length)
		{
			res[k]=b[j];
			j++;
			k++;
		}
		
		
		System.out.println(Arrays.toString(res));
	}

}
