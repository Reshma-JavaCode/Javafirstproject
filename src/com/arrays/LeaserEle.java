package com.arrays;

public class LeaserEle {

	public static void main(String[] args) {

		int a[] = { 12, 1, 7, 5, 6, 2 };
		
		 int leader=a[a.length-1];
		
		 System.out.print(leader + " ");
		 
		 for (int i = a.length - 2; i >= 0; i--) {

	            if (a[i] > leader) {

	                leader = a[i];
	                System.out.print(leader + " ");
	                
	            }
		}
	}

}
