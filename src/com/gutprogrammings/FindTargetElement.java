package com.gutprogrammings;

/*
 * 2. Given a sorted array of integers and a target value, find the index of the target element.
 * If the target element is not present, return -1.
 * Example:
 * Input:
 * arr = [10, 20, 30, 40, 50, 60]
 * target = 40
 * Output:3
 * Constraint:
 * Array is sorted
 * Use Binary Search
 * Time Complexity: O(log n)
 */
public class FindTargetElement {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60},target=40;
	
		int start=0,end=a.length-1;
		
		
		while(start<=end)//0 <=5, 3<=5,3<=3
		{
			int mid= (start + end)/2; //5/2=2,  8/2=4, 6/2=3
			
			if(a[mid]>target) //skip, 50>40,skip
			{
				end=mid-1; //end=4-1=3
				
			}
			else if(a[mid]<target)//30<40(T) ,skip,skip
			{
				start=mid+1;  //start= 3
			}
			else //skip,skip,true target found
			{
				
				System.out.println(mid);
				return;
			}
			
		}
		
		
			System.out.println(-1);
	}

}
