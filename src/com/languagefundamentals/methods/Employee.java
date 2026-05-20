package com.languagefundamentals.methods;

import java.util.Scanner;

public class Employee {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
			
		double sal=getSalary();
		double bonus=getBonus();	
		System.out.println("total salary is: "+(sal+bonus));	
	}
	
	static double getSalary()
	{
		System.out.println("enter your salary: ");
		double sal=sc.nextDouble();
		return sal;	
	}
	
	static double getBonus()
	{
		System.out.println("enter your bonus: ");
		double b=sc.nextDouble();
		return b;
		
	}
	
}
