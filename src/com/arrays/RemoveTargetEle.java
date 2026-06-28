package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

////WAP to remove target element from an array
///and move the remaining elements to forward and remaining spaces add 0;

public class RemoveTargetEle {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);
		
		// int target=30;
		System.out.println("Array values are: \n" + Arrays.toString(a));
		System.out.println("enter target element to remove:");
		int target = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == target) 
			{
				for (int j = i; j < a.length - 1; j++) 
				{
					a[j] = a[j + 1];
				}

				a[a.length - 1] = 0;
				i--;
			}

		}

		System.out.println(Arrays.toString(a));

		sc.close();
	}

}
