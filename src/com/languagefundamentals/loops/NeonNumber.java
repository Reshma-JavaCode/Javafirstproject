package com.languagefundamentals.loops;

import java.util.Scanner;
////Q)Check Whether a Number is a Neon Number or Not
//A Neon Number is a number where the sum of digits 
//of its square is equal to the number itself.
//Example:
//9² = 81
//8 + 1 = 9
//Therefore, 9 is a Neon Number.
public class NeonNumber {

	
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
		System.out.println("enter a number");
		n=sc.nextInt();
		for(int i=1;i<=100;i++)
		if(isNeon(n))
			System.out.println(n+" is Neon Number");
		else
			System.out.println(n+" is not Neon Number");
		sc.close();
	}

}
