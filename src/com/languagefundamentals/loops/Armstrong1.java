package com.languagefundamentals.loops;

import java.util.Scanner;

public class Armstrong1 {

	static int findDigits(int n)
	{
		int rem=0,count=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println(count);
		return count;
	}
	static boolean isArmstrong(int n)
	{
		int rem=0,sum=0,temp=n;
		boolean status=false;
		int digit=findDigits(n);
		
		while(n>0)
		{
			rem= n%10;
			sum= (int) (sum+Math.pow(rem, digit));
			n=n/10;
		}
		if(sum==temp)
			status= true;
		return status;
	}
	
	public static void main(String[] args) {

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a Number");
		n=sc.nextInt();
		if(isArmstrong(n))
			System.out.println(n+" is Armstrong");
		else
			System.out.println("not arm");
	}

}
