package com.streamapi.programming;

import java.util.Scanner;

//.Write a lambda expression to check given prime number or not

interface PrimeNum
{
	String primeNum(int a);
}
public class Lambda04 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int x=sc.nextInt();
		
		
		PrimeNum p=(a)->{
			
			if(a<=1) {
				return "not prime";
			}
			for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%i==0)
					return "Not prime";
				
					
			}
			return "Prime";
		};
		
		System.out.println(p.primeNum(x));
		
	}

}
