package com.assignments;

//return: The method ends here."
//return immediately exits the method.
public class Return1 {

	public static int test() {

	    int i = 0;

	    while (i < 3) {
	        return 2;//exit the method immedietly
	    	//System.out.println(i); //CE
	    }

	    return 0;
	}
	public static void main(String[] args) {

		 System.out.println(test());

			
	}

}
