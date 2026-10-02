package com.dsa;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a= {6,5,8,3,9};
		
		//Bubble sort
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		//Linear search
		int target=3;boolean found=false;
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				found=true;
				System.out.println("found");
				break;
			}

		}
		if(!found)
			System.out.println("not found");
		*/
		//binary search
		int low=0,high=a.length-1;
		while(low<high)
		{
			int mid= (low+high)/2;
			if(a[mid]==target)
			{

				found=true;
				System.out.println("found");
				return;
			}
			else if(a[mid]<target)
				low=mid+1;
			else
				high=mid-1;
			
		}
		if(!found)
			System.out.println("not found");
		
	}

}
