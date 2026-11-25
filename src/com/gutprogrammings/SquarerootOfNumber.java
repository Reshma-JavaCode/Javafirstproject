package com.gutprogrammings;
/*
 * 2. Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
Test case 1:
Input:
x = 8
Output:
2
Test case 2:
Input:
x = 25

Output:
5
 */

// TC: O(log x) , sc=O(1);
public class SquarerootOfNumber {

	public static int squareRoot(int x)
	{
		int s=0,e=x;
		
		int ans=0;
		
		while(s<=e)
		{
			int mid= s+(e-s)/2;
			
			if((long)mid*mid==x)
			{
				return mid;
			}
			else if((long)mid*mid>x)
			{
				ans=mid;
				e=mid-1;			
			}
			else
			{
				ans=mid;
				s=mid+1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {

		int x=16;
		
		int result= squareRoot(x);
		
		System.out.println(result);
	}

}
