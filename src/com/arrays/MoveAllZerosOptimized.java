package com.arrays;

import java.util.Arrays;

public class MoveAllZerosOptimized {

	public static void main(String[] args) {
	
		int[] a= {0,1,0,3,12};
		
		System.out.println(Arrays.toString(a));
		
		int j=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			{
				int temp= a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}

		System.out.println(Arrays.toString(a));
		
	}

}
