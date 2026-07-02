package com.practice;

public class Test5 {

	public static void main(String[] args) {

		Integer i=100;
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);
		System.out.println(i instanceof Integer);
		
		
		System.out.println();
		String s1="Reshu";
		Object s2="Abc";
		
		System.out.println(s1 instanceof String);
		System.out.println(s1 instanceof Object);
		
		System.out.println(s2 instanceof String);
		System.out.println(s2 instanceof Object);
		
		//false
		System.out.println(s2 instanceof StringBuffer);
	}

}
