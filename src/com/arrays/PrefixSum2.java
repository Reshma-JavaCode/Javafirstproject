package com.arrays;

import java.util.Arrays;

//WAP to do prefix sum array
//input: {2,4,6,8,10}
//output: [2, 6, 12, 20, 30]
//Time complexity: O(1)

public class PrefixSum2 {

	public static void main(String[] args) {

		int a[]= {2,4,6,8,10};
		
		for(int i=1;i<a.length;i++)
		{
			a[i] = a[i-1]+a[i];
		}
		
		System.out.println(Arrays.toString(a));

		
		//Or
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		
	}

}
