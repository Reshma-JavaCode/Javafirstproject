package com.arrays;

import java.util.Scanner;

public class HappyNumber {
	static void happyNumber(int n) // 19
	{
		
		int rem, sum = 0;
		int temp=n;
		
		while (n != 1 && n != 4)// 19 82 1=comes out of the loop
		{
			rem = 0;
			sum = 0;

			while (n > 0) // 19 1 //82 8 //68 6 0 //100 10 1
			{
				rem = n % 10; // 9 1 //2 8 //8 6 //0 0 1
				sum = sum + rem * rem; // 9*9=81 ,81+1*1=82 //4,68 //64,64+36=100 //0,0,1
				n = n / 10; // 1 //8 0 //6 0 //10 1 0
			}
			n = sum;// 82 68 100 1
		}
		if (n == 1)// true
		{
			System.out.println(temp+ " is a happy number");
		} else {
			System.out.println(temp+ " is not a happy number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); // 19
		
		//happynumber method
		happyNumber(n);

		sc.close();
	}

}
