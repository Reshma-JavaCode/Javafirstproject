package com.languagefundamentals.loops;

import java.util.Scanner;

public class SumOfDigits {
//Count the digits in a number.
	public static void main(String[] args) {
		int n,sum=0,i,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a big number: ");
		n= sc.nextInt(); //123
		
		//Logic: sum of reminders
		for(i=n;i>0;i=i/10)//123 12 1
		{
			int rem= i%10;//3 2 1
			sum= sum+rem;//0+3 +2 +1
			count++;
		}
		System.out.println("Digits in a number= "+count);
		System.out.println("sum of "+n+" digits= "+sum);
	}

}
