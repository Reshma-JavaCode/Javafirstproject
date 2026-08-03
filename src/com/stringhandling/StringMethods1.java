package com.stringhandling;

import java.util.Scanner;

public class StringMethods1 {

	public static void main(String[] args) {

		String s1="Java programming";
		
		///length(): count the total characters in a string
		System.out.println(s1.length());
		
		///gives char at 3rd index
		System.out.println(s1.charAt(3));
		
		///concat(): join strings
		String s2=" is simple";
		String s3="Language1234";
		System.out.println(s1.concat(s2));
		
		//join 3 strings
		System.out.println(s1.concat(s2).concat(" "+s3));
		
		
	}

}
