package com.operators;

import java.util.Scanner;

//WAP to find even/odd using Bitwise operator
public class EvenOddUsingBitwiseOperator {

	public static void main(String[] args) {
		
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value to find even/odd");
		a=sc.nextInt();
		System.out.println(a&1);
		
		if((a&1)==0)
		{
			//return number & 1 ==0 then even
			//6-- 110&001 = 000
			//4-- 100&001 = 000
			System.out.println(a+" number is even");			
		}
		else
			//return number & 1 ==1 then odd
			//5-- 101&001 = 001 
			//3---011&001 = 001
			System.out.println(a+" number is odd");	

	}

}
