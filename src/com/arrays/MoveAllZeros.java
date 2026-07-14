package com.arrays;

import java.util.Arrays;

////Q) WAP to move all zeros to end of an array
// ex:int[] a= {0,1,0,3,12};
// output: [1, 3, 12, 0, 0]

public class MoveAllZeros {

	public static void main(String[] args) {
		int[] a= {0,1,0,3,12};
		
		System.out.println(Arrays.toString(a));
		
		int pos=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			{
				a[pos]=a[i];
				pos++;
			}
			
		}
			 // Fill remaining positions with zeros
	        while (pos < a.length) {
	            a[pos] = 0;
	            pos++;
	        }
		
		
		System.out.println(Arrays.toString(a));
		
	}

}
