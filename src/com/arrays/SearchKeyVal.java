package com.arrays;

import java.util.Scanner;

public class SearchKeyVal {

	public static void main(String[] args) {

		int a[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);

		System.out.println("enter array values: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array values are: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("enter search element: ");
		int search = sc.nextInt();
		int count = 0, row = 0, col = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == search) {
					row = i;
					col = j;
					count++;
				}
			}
		}

		if (count > 0) {
			System.out.println("Element Found at: (" + row + "," + col+")");
		} else {
			System.out.println("Element not found...");
		}

	}

}
