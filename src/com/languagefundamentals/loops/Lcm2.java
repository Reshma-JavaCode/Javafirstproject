package com.languagefundamentals.loops;

import java.util.Scanner;
////Q)Find LCM
public class Lcm2 {

	static int FindLcm(int a,int b)
	{
		int lcm=0;
		int max=Math.max(a, b);
		while(true)
		{
			if((max%a==0)&&(max%b==0))
			{
				lcm=max;
				//System.out.println(lcm);
				break;
			}
			max++;
		}
		return lcm;
	}
	public static void main(String[] args) {

		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		a= sc.nextInt();//12
		System.out.println("Enter 2nd number");
		b= sc.nextInt();//18
		int c=FindLcm(a,b);
		System.out.println(c);
		sc.close();
	}

}
