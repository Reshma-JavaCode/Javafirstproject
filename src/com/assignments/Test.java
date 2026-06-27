package com.assignments;

public class Test {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		int b[]=a;
		
		System.out.println(a[0]);//1
		System.out.println(b[0]);//1
		
		b[0]=100;
		System.out.println(a[0]);//100
		System.out.println(b[0]);//100
	}

}
