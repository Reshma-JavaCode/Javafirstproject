package com.arrays;

import java.util.Scanner;

public class Multiplication2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1st array row and cols:");
		System.out.print("Enter number of rows: ");
		int r1 = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int c1 = sc.nextInt();

		int a[][] = new int[r1][c1];

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				a[i][j] = sc.nextInt();
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
				b[i][j] = sc.nextInt();
			}
		}
		
		int r3 = Math.max(r1, r2);
		int c3 = Math.max(c1, c2);

		int res[][] = new int[r3][c3];

		for (int i = 0; i < r3; i++) {
		    for (int j = 0; j < c3; j++) {

		        int val1 = 1;   // default value
		        int val2 = 1;   // default value

		        if (i < r1 && j < c1)
		            val1 = a[i][j];

		        if (i < r2 && j < c2)
		            val2 = b[i][j];

		        res[i][j] = val1 * val2;
		    }
		}
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {

				System.out.print(res[i][j]);
			}
			System.out.println();
		}

	}

}
