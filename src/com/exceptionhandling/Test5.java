package com.exceptionhandling;

public class Test5 {

	public static int show() {

	    try {
	        System.out.println("Try");
	        System.exit(0);
	        return 10;
	    }
	    finally {
	        System.out.println("Finally");
	    }
	}
	public static void main(String[] args) {
		System.out.println(show()); //Try
	}

}
