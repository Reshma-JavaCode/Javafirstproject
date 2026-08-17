package com.exceptionhandling;

public class Test12 {

	public static void main(String[] args) {

		String name1="Reshma";
		System.out.println(name1.length());//6
		
		String name2="";
		System.out.println(name2.length());//0
		
		String name3="null";
		System.out.println(name3.length());//4
		
		String name4=null;
		System.out.println(name4.length());
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name4" is null
		//at com.exceptionhandling.Test12.main(Test12.java:17)

	}

}
