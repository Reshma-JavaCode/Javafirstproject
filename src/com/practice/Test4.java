package com.practice;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		System.out.println(a[1]++);
		System.out.println(++a[0]);
		
		System.out.println(Arrays.toString(a));
		
		int c=10,b=30;
		int res= (c>b)?c:b;
		System.out.println((c>b)?c:b);
		System.out.println(res);
	}

}
