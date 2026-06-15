package com.languagefundamentals.loops;

import java.util.Scanner;

////Q) Find LCM
public class LCM {

	static int FindHcf(int a,int b)
	{
		int hcf=0;
		int min=Math.min(a, b);
		for(int i=1;i<=min;i++)
		{
			if((a%i==0)&&(b%i==0))
			{
				hcf=i;
			}
		}
		return hcf;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		a= sc.nextInt();//12
		System.out.println("Enter 2nd number");
		b= sc.nextInt();//18
		int c=FindHcf(a,b);
		int lcm=(a*b)/c;
		System.out.println("Lcm of "+a+" & "+b+" is= "+lcm);
		sc.close();
	}

}
