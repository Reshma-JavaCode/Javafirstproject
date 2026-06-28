package com.arrays;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {

		int empId[]= {10,20,20,10,30};//5
		int resId[]= new int[empId.length];
		int index=0;
		
		System.out.println("Employee Id's with duplicate Id's:");
		System.out.println(Arrays.toString(empId));
		
		for(int i=0;i<empId.length;i++)//0 to 4
		{
			
			boolean status=false;
			
			for(int j=0;j<index;j++)//0 =1 2 3 
			{
				
				if(empId[i]==resId[j])
				{
					status=true;
					break;
				}
				
			}
			
			if(!status)
			{
				resId[index]= empId[i];
				index++;
			}
		}
		
		// Remaining positions are already 0 by default
		System.out.println("Employee Id's without duplicate Id's:");
		System.out.println(Arrays.toString(resId));
		
	}
}
