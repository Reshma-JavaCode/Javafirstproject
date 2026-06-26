package com.patterns;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		
		
		System.out.println("enter a number:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//int n=5;
		
		//Upper part 
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=2*(n-i);k++)
			{
				System.out.print(" ");
			}
			
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//Lower part
		for(int i=1;i<=n-1;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			
			for (int j = 1; j <= 2 * i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
