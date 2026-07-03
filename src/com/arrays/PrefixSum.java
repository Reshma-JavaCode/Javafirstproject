package com.arrays;

//WAP to do prefix sum array
//input: {2,4,6,8,10}
//output: [2, 6, 12, 20, 30]
//Time complexity: O(n)
import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {

		int a[]= {2,4,6,8,10};
		
		int prefix[]= new int[a.length];
		prefix[0]=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			prefix[i] = prefix[i-1] + a[i];
		}
		
		System.out.println(Arrays.toString(prefix));
	}

}
