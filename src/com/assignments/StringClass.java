package com.assignments;

public class StringClass {

	static String change1(String s)
	{
		s="python";
		//System.out.println(s);
		return s;
	}
	static void change(String s , int i)
	{
		s="java";i++;
		System.out.println(s);
		System.out.println(i);
	}
	public static void main(String[] args) {
		String s="Hello";
		int i=9;
		change(s,i);
		System.out.println(s); //Hello, String is immutable
		System.out.println(i);
		System.out.println(change1(s));
		
	}

}
