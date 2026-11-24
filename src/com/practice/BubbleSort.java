package com.practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]= {5,4,3,2};
		
	/*	for(int i=0;i<a.length-1;i++)
		{
			boolean swapped=false;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped)
				return;
		}
		*/
		
		//Selection
		/*for(int i=0;i<a.length-1;i++)
		{
			int minIndx=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minIndx])
					minIndx=j;
			}
			if(minIndx!=i)
			{
			int temp=a[i];
			a[i]=a[minIndx];
			a[minIndx]=temp;
			}
		}*/
		
		//insertion
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];//4
			int j=i-1;//0
			while(j>=0 && a[j]>key)//5>4
			{
				a[j+1]=a[j];//a[1]=5->{5,5,3,2}
				j--;//-1
			}
			
			a[j+1]=key;//a[0]=4
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
