package com.languagefundamentals.loops;

import java.util.Scanner;
////Q)WAP to find a given number is Armstrong or not
///An Armstrong Number (also called a Narcissistic Number) is a number 
///that is equal to the sum of its digits raised to the power of the number of digits.
////ex:153=1^3 + 5^3 + 3^3= 1+125+27 = 153;
///ex:1=1^1=1 ,153,370,371,1634
public class ArmstrongNumbers {

	static boolean isArmstrong(int n)
	{
		boolean status=false;
		int rem=0,sum=0;
		int temp=n;
		//converting n into string to find digits in n by using length() method
		//153length=3
		//calling method with other method : Method chaining
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
