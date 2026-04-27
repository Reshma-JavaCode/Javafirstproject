package com.myfirstpckg;

public class Welcome {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Welcome to java world!");
		Class.forName("com.myfirstpckg.Welcome");
		System.out.println("succ"); 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("end"); 
		
	}

}
 