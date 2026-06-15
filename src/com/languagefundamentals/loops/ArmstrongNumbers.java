package com.languagefundamentals.loops;

import java.util.Scanner;

public class ArmstrongNumbers {

	static boolean isArmstrong(int n)
	{
		boolean status=false;
		int rem=0,sum=0;
		int temp=n;
		int digit=Integer.toString(n).length();
		while(n>0)
		{
			rem= n%10;
			sum=(int)(sum+Math.pow(rem, digit));
			n=n/10;
			
		}
		if(sum==temp)
			status= true;
		return status;
	}
	public static void main(String[] args) {
		int range;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a Range");
		range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			if(isArmstrong(i))
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
