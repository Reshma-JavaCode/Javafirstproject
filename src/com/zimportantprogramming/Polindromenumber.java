package com.zimportantprogramming;

import java.util.Scanner;

public class Polindromenumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a number:");
		int n=sc.nextInt();
		
		int original=n;
		int rev=0;
		
		while(n>0) {
			int digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
		}
		if(original==rev)
			System.out.println(original+" is Polindrome num");
		else
			System.out.println(original+" is not a Polindrome num");
		
		sc.close();
	}

}
