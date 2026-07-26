package com.zimportantprogramming;

import java.util.Scanner;

public class PolindromeNumRange {

	static boolean isPolindrome(int n)
	{
		boolean status=false;
		
		int original=n;
		int rev=0;
		
		while(n>0) {
			int digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
		}
		if(original==rev)
			status=true;
		
		return status;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range to get Polindrome numbers:");
		int range= sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			boolean status=isPolindrome(i);
			if(status)
				System.out.println(i+" ");
		}
		sc.close();
	}

}
