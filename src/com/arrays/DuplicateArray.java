package com.arrays;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {

		int a[]= {10,20,20,10,70};//5
		int res[]= new int[a.length];
		int index=0;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)//0 to 4
		{
			boolean status=false;
			for(int j=0;j<index;j++)//0 =1 2 3 
			{
				if(a[i]==res[j])
				{
					status=true;
					break;
				}
			}
			
			if(!status)
			{
				res[index]= a[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(res));
		
	}

}
