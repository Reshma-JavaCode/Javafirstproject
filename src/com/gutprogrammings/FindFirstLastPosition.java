package com.gutprogrammings;

import java.util.Scanner;

//TC: O(log x) , sc=O(1);
/*
 * Story: A shopping application stores product prices in sorted order. Multiple products may have the same price. Find the first and last positions of a particular price.

Problem statement: Given a sorted array containing duplicates and a target, return the first and last indexes of the target. If it doesn't exist, return [-1, -1]
Test Case 1:
Input:
arr = [5, 7, 7, 8, 8, 10]
target = 8
Output:[3, 4]
Test Case 2:
Input:
arr = [5, 7, 7, 8, 8, 10]
target = 6
Output: [-1, -1]
 */
public class FindFirstLastPosition {
	
	public static int[] binarySearch(int[] a,int target)
	{
		//int res[]=new int[a.length];
		int s=0,e=a.length-1;
		
		
		int first=-1,last=-1;
		
		//To find First Occurence
		
		while(s<=e)//3<=5, 3<=3, 3<=2F
		{
			int mid= s+(e-s)/2;//2, 4, 3
			
			if(a[mid]==target)//7 , 8, 8
			{
				first= mid;//4 , 3
				e=mid-1;//3 2 //move right side to find first index
			}
			else if(a[mid]<target)//7<8
			{
				s=mid+1;//s=3
			}
			else
			{
				e=mid-1;
			}
		}
		
		//To find Last Occurence
		s=0;
		e=a.length-1;
		
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			
			if(a[mid]==target)
			{
				last= mid;
				s=mid+1;// move right side to search last index
			}
			else if(a[mid]<target)
			{
				s=mid+1;
			}
			else
				e=mid-1;
		
		}
		
		return new int[] {first,last};
		
	}

	public static void main(String[] args) {

		int a[]= {5,7,7,8,8,10};
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter target element:");
		int target= sc.nextInt();
		
		int[] result=binarySearch(a,target);
		
		System.out.print(result[0]+" "+result[1]);
		
		sc.close();
	}

}
