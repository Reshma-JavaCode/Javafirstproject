package com.zimportantprogramming;

import java.util.Scanner;

public class ArmstrongNumbersRange {
	
	
	static int findArmstrongNum(int n)
	{
		int sum=0;
		int temp=n;
		int count=0;
		//find digits
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
	     temp=n;
		//Armstrong logic
		while(n>0) {
			int digit= n%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*digit;
			}
			sum=sum+pow;
			n=n/10;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range to get Armstrong numbers:");
		int range= sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			int res=findArmstrongNum(i);
			if(res==i)
			{
				System.out.println(i+" ");
			}
		}
		
		sc.close();
	}

}
