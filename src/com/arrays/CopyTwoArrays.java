package com.arrays;

import java.util.Arrays;

public class CopyTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int b[]= {40,50};
		
		int sz= a.length+b.length;
		int c[]= new int[sz];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		//int count=a.length;
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]= b[i];
//			c[count]=b[i];
//			count++;
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		System.out.println(Arrays.toString(c));
	}

}
