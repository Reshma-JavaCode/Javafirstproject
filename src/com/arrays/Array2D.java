package com.arrays;

import java.util.Scanner;
//WAP to read and display 2D array
public class Array2D {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][3];
		//rows=2 columns=3 values=2*3=6
		//a.length=rows
		//a[0].length=columns
		//a[1].length=colums
		
		 System.out.println("Enter 6 elements:");

	        // Input
	        for(int i = 0; i < a.length; i++) {
	            for(int j = 0; j < a[i].length; j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        //creating array values
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 3;
//		a[1][1] = 4;
//		a[1][2] = 5;
	        
	        //display
		for(int i=0;i<a.length;i++)//2rows= 0 1
		{
			for(int j=0;j<a[i].length;j++)//0th row=0 1 2 columns and 1st row=0 1 2 col
			{
				
				System.out.print(a[i][j]+" ");
				//System.out.println(a[i]); adress of the object
				//[I@5ca881b5
//				 [I@5ca881b5
//				 [I@5ca881b5
//				 [I@24d46ca6
//				 [I@24d46ca6
//				 [I@24d46ca6
				
			}
			System.out.println();
		}
	}

}
