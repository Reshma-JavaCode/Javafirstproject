package com.arrays;

import java.util.Scanner;
//WAP to read and display string elements  in array
public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Sz of an array:");
		int sz = sc.nextInt();

		sc.nextLine();
		String names[]=new String[sz];
		System.out.println("enter " + sz + " names: ");
		for (int i = 0; i < sz; i++) {
			names[i] = sc.nextLine();
		}
		
		
		System.out.println("enter " + sz + " names: ");
		for (int i = 0; i < sz; i++) {
			if(names[i].startsWith("S"))
			{
				System.out.println(names[i]);
			}
		}
	}

}
