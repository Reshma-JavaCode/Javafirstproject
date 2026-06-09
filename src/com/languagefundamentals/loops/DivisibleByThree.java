package com.languagefundamentals.loops;

import java.util.Scanner;
//WAP to Count the numbers from 1 to N that are divisible by 3.
public class DivisibleByThree {

	public static void main(String[] args) {

		int n,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number: ");
		n= sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				//System.out.println(i);
				count++;
			}
		}
		System.out.println("Numbers from 1 to "+n+" that are divisible by 3= "+count);
	}

}
