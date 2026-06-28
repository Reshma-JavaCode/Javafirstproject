package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveTargetEle2 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);

		// int target=30;
		System.out.println("Array values are: \n" + Arrays.toString(a));
		System.out.println("enter target element to remove:");
		int target = sc.nextInt();

		int k = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != target) {
				a[k] = a[i];
				k++;
			}

		}

		while (k < a.length) {
			a[k] = 0;
			k++;
		}

		System.out.println("Array values: \n" + Arrays.toString(a));

		sc.close();
	}

}
