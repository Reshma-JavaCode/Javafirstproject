package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotationalArray {

	//reversing logic
	static void reverseOrder(int[] a,int s,int e)
	{
		while(s<e)
		{
			int temp= a[s];
			a[s]=a[e];
			a[e]= temp;
			s++;
			e--;
		}
	}
	
	static void rotationalArray(int a[],int r)
	{
		int start=0, end=a.length-1;
		
		//Total array reversing
		//output: [8,7,6,5,4,3,2,1]
		//reverseOrder(a, 0,7);
		reverseOrder(a,start,end);
		
		//reverse the 1st half of array using rotation value 
		//i.e r=5 -> 0 to 4 need to to reverse 1,2,3,4,5
		//[8,7,6,5,4] becomes [4, 5, 6, 7, 8]
		//[4, 5, 6, 7, 8,  3,2,1]
		//reverseOrder(a, 0, 4);
		reverseOrder(a, start, r-1);
		
		
		//reverse the 2nd half of array using rotation value 
		//i.e r=5 -> r to last need to to reverse 6,7,8
		//index from 5 to 7
		//[3,2,1] -> [1,2,3]
		//[4, 5, 6, 7, 8, 1, 2, 3]
		//reverseOrder(a, 5, 7);
		reverseOrder(a, r, end);		
	}
	
	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8};
		Scanner sc= new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.println("How many times do you want to rotate?...");
		int r= sc.nextInt();//5
		
		rotationalArray(a,r);
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
