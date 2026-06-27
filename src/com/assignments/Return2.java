package com.assignments;

public class Return2 {

	static int test() {

	    for (int i = 1; i < 5; i++) {

	        if (i == 2) {
	            return 2;//exit from the method immedietly
	        }

	        System.out.println(i);//1
	    }

	    return 0;
	}
	
	public static void main(String[] args) {
		
		int val=test();
		System.out.println(val);//2
	}

}
