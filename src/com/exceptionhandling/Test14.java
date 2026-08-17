package com.exceptionhandling;

public class Test14 {

	public static void main(String[] args) {

		String s="Java";
		
		System.out.println(s.indexOf('a'));//1
		System.out.println(s.indexOf('M'));//-1 not exists
		System.out.println(s.charAt(1));//a
		System.out.println(s.charAt(9));//java.lang.StringIndexOutOfBoundsException
	}

}
