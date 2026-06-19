package com.languagefundamentals.loops;

import java.util.Scanner;
////Q)WAP to Find given number is Strong or not
//ex:145
//=1! + 4! + 5! =1+2+125= 145 is strong number
public class StrongNumber {

	static int Factorial(int n)//5
	{
		int fact=1;
		//System.out.println("n= "+n);
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;//1*2*3*4*5
		}
		//System.out.println("factorial= "+fact);
		return fact;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();//145
		
		int rem=0;
		int temp=n;
		int fact=0;
		while(n>0)//145 14 1
		{
			rem=n%10;//5 4 1
			//System.out.println("Reminder= "+rem);
			//Factorial(rem):- To find Factorial of every digit(reminder)
			fact=fact+Factorial(rem);//0+120 +24+1 
			n=n/10;//14 1
		}
		if(temp==fact)
		{
			System.out.println(temp+" Given number is Strong number");
		}
		else
		{
			System.out.println(temp+" Given number is not a Strong number");
		}
		}
			
	}


