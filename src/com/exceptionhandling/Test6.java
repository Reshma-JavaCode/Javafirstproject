package com.exceptionhandling;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter a string1:");
		String s1=sc.next();
		System.out.println("Enter a string2:");
		String s2=sc.next();
		
		//Converting string to int
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		
		System.out.println(n1+" divides "+n2+":");
		System.out.println(n1/n2);
		}
		catch(ArithmeticException | NumberFormatException e)
		{
			System.err.println("Error: "+e.toString());
		}
//		catch(ArithmeticException e)
//		{
//			System.err.println(e.toString());
//		}
		
		sc.close();
	}

}
//Output:

/*
 Enter a string1:
100
Enter a string2:
5
100 divides 5:
20
 */

/*Enter a string1:
10
Enter a string2:
0
10 divides 0:
Error: java.lang.ArithmeticException: / by zero*/

/*
Enter a string1:
abc
Enter a string2:
2
Error: java.lang.NumberFormatException: For input string: "abc"

 */

