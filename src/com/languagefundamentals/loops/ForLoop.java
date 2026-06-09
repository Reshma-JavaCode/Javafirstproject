package com.languagefundamentals.loops;

import java.util.Scanner;

public class ForLoop {

	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int n= sc.nextInt();
		
		//for(int i=0; i<=n; ){System.out.println(i);}
		//output:
		//leads to infinity 0's since,there is no increment/decrement
		//continously if n=5, 0<=5 is true so, infinity
		
		for(int i=0; i<=n; i++)
		{
			System.out.println(i);
		}
	}

}
