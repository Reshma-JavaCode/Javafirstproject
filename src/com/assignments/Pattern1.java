package com.assignments;

import java.util.Scanner;

//Input: n = 5, DHONI

//Output:
//
//D A B C D
//D H E H F
//G H O I J
//K N L N M
//I N O P I
public class Pattern1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		String s=sc.next();
		int n=5;
		char ch='A';
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || j==(n-1-i))
				{
					System.out.print(s.charAt(i)+" ");
				}
				else
				{
					System.out.print((ch++) +" ");
				}
			}
			System.out.println();
		}
		
	}

}
