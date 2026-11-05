package com.streamapi.programming;

import java.util.Arrays;

//.Write a Java program using Stream API to count 
//the frequency of each character in a string.
public class Test2 {

	public static void main(String[] args) {

		String s="Hello";
		
		System.out.println(Arrays.stream(s.split("")));
		
	}

}
