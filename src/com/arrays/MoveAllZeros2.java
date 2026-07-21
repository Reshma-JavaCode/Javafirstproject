package com.arrays;

import java.util.Arrays;

//Q) Moving all zeros using single loop 
public class MoveAllZeros2 {

	public static void main(String[] args) {

		int a[]= {1,0,3,0,4,0};
		int pos=0;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)//i=0 2 4
			{
				int temp=a[pos];//1 0 0
				a[pos]=a[i];//a[0]=1 a[1]=3 a[2]=4
				a[i]=temp;//1 a[2]=0 a[4]=0
				pos++;//1 2 3
			}
		}//a[0]=1 a[1]=3 a[2]=4 a[4]=0 by-deafult array values for a[3]&a[5]=0
		
		System.out.println(Arrays.toString(a));
		
	}

}
