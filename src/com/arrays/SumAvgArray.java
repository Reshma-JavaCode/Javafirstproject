package com.arrays;

import java.util.Scanner;
//WAP to find sum and average of a numbers in array
public class SumAvgArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Sz of an array:");
		int sz = sc.nextInt();

		int num[] = new int[sz];
		//Reading array values
		System.out.println("enter " + sz + " array values: ");
		for (int i = 0; i < sz; i++) {
			num[i] = sc.nextInt();
		}
		
		//Displayong array values
		System.out.println("Array values are: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		
		//To find Sum
		int sum=0;
		double avg=0;
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		avg=sum/sz;
		System.out.println("\nSum of array values: "+sum);
		System.out.println("average of array values is: "+avg);
		sc.close();

	}

}
