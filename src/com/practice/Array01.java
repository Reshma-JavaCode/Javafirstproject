package com.practice;

import java.util.Arrays;

//kth largest element in array
public class Array01 {

	public static void main(String[] args) {

		//int []a= {10,5,20,8,15,17,28,6};
		//int k=6;
		int []a= {10,5,20,8,15};
		int k=2;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(a[k-1]);//15
		
	}

}
