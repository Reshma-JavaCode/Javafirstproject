package com.languagefundamentals.loops;

import java.util.Scanner;
////Q) Binary To Decimal
public class BinaryToDecimal {

	static void toDecimal(int n)
	{
		int rem=0;
		int dec=0,count=0;
		while(n>0)//100 10 1
		{
			rem= n%10;//100%10=0 10%10=0 1
			n= n/10;//10 1 0
			dec=dec+(int) (rem*Math.pow(2, count));
			count++;
		}
		System.out.println(dec);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n= sc.nextInt();//10
		toDecimal(n);

	}

}
