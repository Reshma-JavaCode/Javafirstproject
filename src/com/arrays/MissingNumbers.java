package com.arrays;

import java.util.Scanner;

////1.Write a Java program to find all the missing numbers from an array containing numbers from 1 to N.
//Input:N = 12
//Array = {1, 3, 4, 6, 8, 9, 12}
//Output:Missing Numbers = 2 5 7 10 11

//Marking array → O(n) (n is the size of the input array)
//Checking from 1 to N → O(N)
//TimeComplexity: O(n+N)

//Space Complexity: O(N)
public class MissingNumbers {

	public static void main(String[] args) {

		int a[]= {1, 3, 4, 6, 8, 9, 12};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number limit: ");
		int n= sc.nextInt();
		
		boolean present[]= new boolean[n+1];
		
		for(int i=0;i<a.length;i++)
		{
			// Mark the numbers that are present
			present[a[i]]= true;//1 3 4 6 8 9 12= true other numbers false
		}
		
		for(int i=1;i<=n;i++)//excluding 0 no. ,need to 0 number as per requirements
		{
			if(!present[i])//false, index printing
			{
				System.out.print(i+" ");//2 5 7 10 11
			}
		}
		
		sc.close();
	}

}
