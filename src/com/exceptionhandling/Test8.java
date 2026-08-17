package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		String name=null;
		int age;
		int marks[]=new int[6];
		double sum=0,avg=0;
		
		Scanner sc=new Scanner(System.in);
	
		try {
	//	System.out.println("Student name length: "+name.length());
		System.out.println("Enter Student Name:");
		name=sc.nextLine();
		System.out.println("Enter Student Age:");
		age=sc.nextInt();
		System.out.println("Enter "+name+"'s 6 subject marks: ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
		
		System.out.println("Student marks: ");
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
		avg=sum/marks.length;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	
		}
		
		catch(NullPointerException e)
		{
			System.err.println("Null pointer exception "+e.toString());
		}
		catch(InputMismatchException e)
		{
			System.err.println("Invalid input "+e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Array values out of bounds "+e.toString());
		}
		
		finally
		{
			System.out.println("\nFinally block");
		}
		sc.close();
		
	}

}
