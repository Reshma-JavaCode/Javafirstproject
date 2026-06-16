package com.languagefundamentals.loops;

import java.util.Scanner;

//Q)Write a Java program to count the number of times a given digit occurs in a number using a while loop
//Input:Number = 122333
//Digit = 3
//Output:3
public class DigitOccurence {

	static int findDigitCount(int n,int d)
	{
		int rem=0,count=0;
		while(n>0)
		{
			rem=n%10;
			
			if(rem==d)
			{
				count++;
			}
			n=n/10;
		}
		//System.out.println(count);
		return count;
	}
	public static void main(String[] args) {

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		System.out.println("enter a digit");
		int d=sc.nextInt();
		int digitOccured=findDigitCount(n,d);
		System.out.println(digitOccured);
		sc.close();
		
	}

}
