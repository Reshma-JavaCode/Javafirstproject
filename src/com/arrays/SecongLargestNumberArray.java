package com.arrays;

import java.util.Scanner;
//WAP to find second Largest number in array
public class SecongLargestNumberArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Sz of an array:");
		int sz = sc.nextInt();

		int num[] = new int[sz];

		System.out.println("enter " + sz + " array values: ");
		for (int i = 0; i < sz; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Array values are: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		
		int max1 = num[0];
		int max2=num[0];
		int temp;
		//System.out.println("Max= " + max);
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max1) {
				temp=max1;
				max2=max1;
				max1 = num[i];
			}
			else if(num[i]>max2)
			{
				max2= num[i];
			}
		}
		System.out.println("\nThe second largest number in a given array is : " + max2);
		sc.close();

	}

}
