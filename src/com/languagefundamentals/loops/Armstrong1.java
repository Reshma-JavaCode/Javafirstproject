package com.languagefundamentals.loops;

import java.util.Scanner;
////Q)WAP to find a given number is Armstrong or not
///An Armstrong Number (also called a Narcissistic Number) is a number 
///that is equal to the sum of its digits raised to the power of the number of digits.
////ex:153=1^3 + 5^3 + 3^3= 1+125+27 = 153;
///ex:1=1^1=1 ,153,370,371,1634
public class Armstrong1 {

	//To find digits in a given number
	static int findDigits(int n)
	{
		int rem=0,count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
		return count;
	}
	
	//Armstrong Logic
	static boolean isArmstrong(int n)
	{
		int rem=0,sum=0,temp=n;
		boolean status=false;
		//Find how many digits in a given number
		int digit=findDigits(n);
		
		//Armstrong Logic 
		while(n>0) //153 15 1 0=exit from condition
		{
			rem= n%10;//3 5 1
			sum= (int) (sum+Math.pow(rem, digit));//pow(3,3)=27 , 27+pow(5,3), 152+pow(1,3)=152+1=153
			n=n/10;//15 1 0
		}
		if(sum==temp)//153==153
			status= true;
		return status;
	}
	
	public static void main(String[] args) {

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a Number");
		n=sc.nextInt();//153
		if(isArmstrong(n))
			System.out.println(n+" is Armstrong number");
		else
			System.out.println(n+" not Armstrong number");
	}

}
