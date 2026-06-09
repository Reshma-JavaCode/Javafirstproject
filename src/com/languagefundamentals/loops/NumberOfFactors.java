package com.languagefundamentals.loops;
//WAP to Count the number of factors of a number.
import java.util.Scanner;
public class NumberOfFactors {

	public static void main(String[] args) {

		int n,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		n= sc.nextInt(); 
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
				
			}
		}
		System.out.println("count= "+count);
	}

}
