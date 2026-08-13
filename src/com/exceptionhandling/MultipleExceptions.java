package com.exceptionhandling;

import java.util.Scanner;

public class MultipleExceptions {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a value:");
//		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		int[] arr = {10, 20, 30};
	
		try {
		
			System.out.println(arr[0]/b);
			 System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
				
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		sc.close();
	}

}
