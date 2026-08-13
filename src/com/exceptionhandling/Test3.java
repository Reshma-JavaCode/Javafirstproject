package com.exceptionhandling;

//Q) How normally the finally block does not get a chance to execute??

public class Test3 {

	public static void main(String[] args) {

		try {
			System.out.println("In try");
		}
		finally
		{
			System.out.println("In finally");
		}
		
		//Solution: System.exit(0) terminates the JVM, 
		//so normally the finally block does not get a chance to execute.
		System.out.println();
		try {
			System.out.println("In try2");
			System.exit(0);
		}
		finally
		{
			System.out.println("In finally2");
		}
		
	}

}
