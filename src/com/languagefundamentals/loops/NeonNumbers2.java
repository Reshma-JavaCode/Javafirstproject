package com.languagefundamentals.loops;

import java.util.Scanner;

public class NeonNumbers2 {

	static boolean isNeon(int n)
	{
		boolean status=false;
		int rem=0,sum=0;
		int temp=n*n;//81
		int temp2=temp;//81
		while(temp>0)//81 8
		{
			rem= temp%10;//1 8
			
			sum=sum+rem;//1 1+8=9
			temp=temp/10;//8 0
		}
		if(sum==n)
			status=true;
		return status;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a range");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		if(isNeon(i))
			System.out.println(i+" ");
		
		}
	}

}
