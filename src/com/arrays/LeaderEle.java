package com.arrays;

public class LeaderEle {

////Q) WAP to print leader elements in an array
/////compare each element with right elements->
/// if all right side elements of a current number then 
///(count it) is leader ele

///{ 12, 1, 7, 5, 6, 2 }--> o/p: 12 7 6 2
			
	public static void main(String[] args) {

		int a[] = { 12, 1, 7, 5, 6, 2 };
		// int a[]= {17,5,2,7,8};

		System.out.println("Leader elements in an array: ");
		
		for (int i = 0; i < a.length; i++) {

			int count = 0;

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					count++;
				}

			}
			
				if (count == (a.length - 1) - i) {
				System.out.print(a[i] + " ");
			}

		}
	}

}
