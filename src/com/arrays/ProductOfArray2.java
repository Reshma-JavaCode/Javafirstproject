package com.arrays;


//product of remaining elements in array
//1,2,3,4
//1--> 2*3*4 =24
//2--> 1*3*4= 12
//3--> 1*2*4= 8
//4--> 1*2*3= 6

//but it work for non-zero elements only

//Time complexity: O(n);

public class ProductOfArray2 {
	
	public static void main(String[] args) {
	
		int[] a = {1, 2, 3, 4};

		int totalProduct = 1;

		for (int i = 0; i < a.length; i++) {
		    totalProduct *= a[i];
		}

		for (int i = 0; i < a.length; i++) {
		    System.out.println("Product except " + a[i] + " = " + (totalProduct / a[i]));
		}

	}

}
