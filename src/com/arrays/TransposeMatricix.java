package com.arrays;

import java.util.Scanner;

public class TransposeMatricix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int a[][] = new int[r][c];
		int t[][] = new int[c][r];

		System.out.println("Enter "+ (r*c) +" values");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		//Display actual array ele
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		
		//Logic 
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				t[j][i] = a[i][j];
			}
		}

		
		 System.out.println("Transpose Matrix:");
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(t[i][j]);
			}
			System.out.println();
		}
		sc.close();

	}

}
