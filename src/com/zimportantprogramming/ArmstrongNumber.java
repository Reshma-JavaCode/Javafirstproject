package com.zimportantprogramming;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a number:");
		int n=sc.nextInt();
		
		int original=n,temp=n;
		int sum=0;
		int count=0;
		
		//finding digits
		while(temp>0)
		{
			count++;
			temp/=10;
		}
				
		//logic
		while(n>0)
		{
			int digit= n%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*digit;
			}
			
			sum=sum+pow;
			n=n/10;
		}
		
		if(sum==original)
			System.out.println(original+" is armstrong num");
		else
			System.out.println(original+" is not a armstrong num");
		
		sc.close();
	}

}
