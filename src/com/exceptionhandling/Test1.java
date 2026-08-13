package com.exceptionhandling;

public class Test1 {

	public static void main(String[] args) {

		try {
			System.out.println("in try1");
			System.out.println(10/2);
			System.out.println(10/0);
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("In catch");
			System.err.println(e.getMessage());
		}
		finally
		{
			System.out.println("In Finally..");
		}
		
		System.out.println("Method ended..");
	}

}
