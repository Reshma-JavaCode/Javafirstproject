package com.arrays;

import java.util.Scanner;

public class PairsArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int a[]= {2,4,3,5,7,8,9};
		
		System.out.println("enter target: ");
		int target= sc.nextInt();
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j])==target)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		
		sc.close();		
	}

}
