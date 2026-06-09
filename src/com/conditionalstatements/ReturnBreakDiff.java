package com.conditionalstatements;

import java.util.Scanner;

public class ReturnBreakDiff {

	//since return gng to exit whole method
	static String getDay(int day) {
		System.out.println("***** return *******");
	    if(day == 1) {
	        return "Sunday";
	    }

	    System.out.println("This won't execute if day == 1");
	    return "Invalid";
	}
	static void getInfo() {
		System.out.println("***** break *******");
		for(int i=1;i<10;i++)
		{
			//1 2 3 4
	    if(i == 5) {
	        break;
	    }

	    System.out.println(i);
		}
	    
	}
	static void getInfo2() {
		System.out.println("***** continue *******");
		for(int i=1;i<10;i++)
		{
			//1 2 3 4 6 7 8 9
	    if(i==5)
	    {
	    	continue;
	    }

	    System.out.println(i);
		}
	    
	}
	public static void main(String[] args) {

		int day;
		Scanner sc= new Scanner(System.in);
		
		//continue
		System.out.println("Enter A Day: ");
		day= sc.nextInt();
		String res= getDay(day);
		System.out.println(res);
		
		//break
//		int n;
//		System.out.println("Enter A Day: ");
//		n= sc.nextInt();
		getInfo();
		getInfo2();
		
	}

}
