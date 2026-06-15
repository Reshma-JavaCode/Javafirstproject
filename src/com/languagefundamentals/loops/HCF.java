package com.languagefundamentals.loops;

import java.util.Scanner;
////Q) Find HCF

public class HCF {

	static int FindHcf(int a,int b)
	{
		int hcf=0;
		//common factor not>12 in between 12&18
		int min=Math.min(a, b); //12
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
		System.out.println("Hcf of "+a+ " & "+b +" ="+ c);
		sc.close();
	}

}
