package com.assignments;

import java.util.Arrays;
//Optimized using only one loop moving zeros 
public class Test11 {

	public static void main(String[] args) {

		
		int a[]= {0,1,0,3,12,0};
		//int res[]=new int[a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)//swapping
			{
				int temp=a[i];//1       3       12
				a[i]=a[index];//a[1]=0  a[3]=0  a[4]=0
				a[index]=temp;//a[0]=1 a[1]=3  a[2]=12
				index++;//1 2
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
