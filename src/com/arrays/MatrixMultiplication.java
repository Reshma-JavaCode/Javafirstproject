package com.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1st array row and cols:");
		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int a[][] = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter 2nd arrays:");
		System.out.print("Enter number of rows: ");
		int r2 = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int c2 = sc.nextInt();

		int b[][] = new int[r2][c2];
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		
		if(r2!=c)
		{
			System.out.println("Not possible...");
			return;
		}
		
		
		int res[][]=new int[r][c2];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c2; j++) {	
				for(int k=0;k<c;k++)
				{
				res[i][j]=a[i][k]*b[k][j];
			}}
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c2; j++) {
		
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}

}
