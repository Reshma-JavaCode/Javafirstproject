package com.languagefundamentals.loops;

//WAP to Check whether a number is Prime.
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {

		int n,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is Prime Number");
		}
		else
			System.out.println(n+" is not a prime number");
	}

}
