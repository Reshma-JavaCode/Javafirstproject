package com.dsa;

import java.util.Scanner;

////Q) pointers sum technique:-
///Note: first, array must be in sort** 
///	If sum < target, move start++ because you need a larger sum.
///	If sum > target, move end-- because you need a smaller sum.
///	If sum == target, you found the pair.
///
///Because increasing start always increases the sum, 
///and decreasing end always decreases the sum
///TC: O(n)

public class PointerSumTechnique {

	public static void main(String[] args) {

		int a[]= {3,5,6,7,8,9,10,11};
		
		System.out.println("Enter target value:");
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		
		int start=0, end= a.length-1;
		boolean found = false;
		
		while(start<end)
		{
			int sum= a[start]+a[end];
			
			 if(sum==target)
			 {
				 System.out.println("Pairs found: ");
				 System.out.println(a[start]+" "+a[end]);
				 found= true;
				 start++; end--;
				//break; to get first occured pair only
			 }
			 else if(sum<target)
			 {
				 start++;
			 }
			 else
			 {
				 end--;
			 }
		 }
		if(!found)
		{
		    System.out.println("No pair found.");
		}
		
		sc.close();
	}

}
