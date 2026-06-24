package com.arrays;

import java.util.Scanner;
////WAP to get find the given element in array
///if found display each element index
///ex: {1,2,3,5,3}
///key=3 -> found at 2 and index 4
public class SearchVal3 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//Reading values
		System.out.println("enter array values: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		//To Display
		System.out.println("Array values are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		//logic to get each index of found element
		System.out.println("enter search element: ");
		int search = sc.nextInt();
		boolean status=false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				System.out.println("element found at index: "+i);
				status= true;
			}
		}

		//if status=false; not Found
		if (!status) {
			System.out.println("Element not found...");
		}
		
		sc.close();
	}

}
