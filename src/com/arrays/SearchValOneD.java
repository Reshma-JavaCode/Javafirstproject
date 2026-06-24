package com.arrays;
import java.util.Scanner;

////WAP to find wether the given number found or not in a an array
///requirement: if many similar elements then need
///first occurence of element index
///ex:{10,20,30,20,40};
///key=20 20 at 1st index needed

public class SearchValOneD {

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

		//logic
		System.out.println("enter search element: ");
		int search = sc.nextInt();
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				index = i;
				break;//* to get 1st occurence index
			}
		}

		//Found or not
		if (index > 0) {
			System.out.println("Element Found at index: " + index);
		} else {
			System.out.println("Element not found...");
		}
		sc.close();
	}

}
