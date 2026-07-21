package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter array size:");
		int sz1 = sc.nextInt();
		int a[] = new int[sz1];

		System.out.println("Enter 1st array " + sz1 + " values:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter 2nd array sz:");
		int sz2 = sc.nextInt();
		int b[] = new int[sz2];

		for (int j = 0; j < b.length; j++) {
			b[j] = sc.nextInt();
		}

		/*int sz3 = 0;

		if (a.length != b.length) {
			sz3 = (a.length > b.length) ? a.length : b.length;
		} else
			sz3 = a.length;
*/
		
		int sz3= Math.max(sz1, sz2);
		System.out.println("Sz: "+sz3);
		
		int c[] = new int[sz3];

		int i = 0, j = 0, index = 0;

		while (i < a.length && j < b.length) {
			c[index] = a[i] * b[j];
			i++;
			j++;
			index++;
		}
		while (i < a.length) {
			c[index] = a[i];
			i++;index++;
		}
		while (j < b.length) {
			c[index] = b[j];
			j++; index++;
		}

		System.out.println(Arrays.toString(c));
	}

}
