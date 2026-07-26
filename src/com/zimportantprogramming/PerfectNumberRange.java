package com.zimportantprogramming;

import java.util.Scanner;

public class PerfectNumberRange {

	static boolean isPerfect(int n)
	{
		boolean status=false;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}

		if(sum==n)
		 status= true;
		
		return status;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range to get Prime numbers:");
		int range= sc.nextInt();
		//int count=0;
		
		for(int i=1;i<=range;i++)
		{
			boolean status=isPerfect(i);
			if(status)
			{
				//count++;
				System.out.println(i+" ");
			}
		}
		
		sc.close();
	}

}
