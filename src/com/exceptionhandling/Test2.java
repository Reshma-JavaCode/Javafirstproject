package com.exceptionhandling;

public class Test2 {

	public static void main(String[] args) {
		
		int age = 15;

		if (age < 18) {
		    System.out.println("Not eligible");
		   // System.exit(0); //succesfull termination
		    System.exit(1); //or Syste,exit(2);//abnormal termination
		}

		System.out.println("Continue...");
	}

}
