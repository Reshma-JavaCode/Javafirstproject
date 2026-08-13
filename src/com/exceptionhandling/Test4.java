package com.exceptionhandling;

public class Test4 {

	//Even though return 10 is inside try, 
	//finally executes before the method actually returns.
	public static int test1() {

	    try {
	        return 10;
	    }
	    finally {
	        System.out.println("Finally executed");
	    }
	}
	
	//The return 20 in finally overrides the return 10.
	public static int test() {

	    try {
	        return 10;
	    }
	    finally {
	        return 20;
	    }
	}
	
	public static void main(String[] args) {

		System.out.println(test());//20
		System.out.println();
		System.out.println(test1());
		
	}

}
