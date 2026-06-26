package com.arrays;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {

		int a[]= {10,20,30};
		int b[]= {30,40};
		int sum[];
		int sz;
		if(a.length>b.length)
		{
			sz=a.length;
		}
		else if(a.length<b.length)
		{
			sz=b.length;
		}
		else
			sz=a.length;
		
	//Predefined method to get big size in b/w a and b arrays
	//	int sz= Math.max(a.length, b.length);
		sum=new int[sz];
		
		for(int i=0;i<sz;i++)
		{
			int x=0,y=0;
			if(i<a.length)
			{
				x=a[i];
			}
			if(i<b.length)
			{
				y=b[i];
			}
			sum[i]=x+y;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		System.out.println(Arrays.toString(sum));
	}

}
