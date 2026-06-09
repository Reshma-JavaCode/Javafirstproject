package com.languagefundamentals.operators;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {

		String fullName;
		double assets, sal, height, weight;
		int age;
		boolean hasSiblings;
		Scanner sc = new Scanner(System.in);

		System.out.println("******welcome to MR Matrimonial site********");
		System.out.println("");
		System.out.println("Enter Your Full Name: ");
		fullName = sc.nextLine();

		System.out.println("Enter Your Assets: ");
		assets = sc.nextDouble();

		if (assets >= 1000000.00) {
			System.out.println("Nice, we can proceed !!");
			System.out.println("Enter Your Salary: ");
			sal = sc.nextDouble();
			if (sal >= 50000.00) {
				System.out.println("Good salary!!");

				System.out.println("Enter Your age: ");
				age = sc.nextInt();

				if (age >= 27 && age <= 30) {
					System.out.println("Good to here!!");

					System.out.println("Enter Your height: ");
					height = sc.nextDouble();
					System.out.println("Enter Your Weight: ");
					weight = sc.nextDouble();

					if ((height >= 5.4) && (weight > 60) && (weight <= 70)) {
						System.out.println("You Looks healthy");
						System.out.println("Do You Have Siblings ?");
						hasSiblings = sc.nextBoolean();
						if (hasSiblings) {
							System.out.println("OMG!!!");
						}

						else {
							System.out.println("****All The Best***");
							System.out.println("Will contact you soon!!");
						}
					} else {
						System.out.println("sorry, your height and weight not matching !!!");
					}
				} else {
					System.out.println("sorry, your age is not matching!!");
				}

			} else {
				System.out.println("Sorry not Satisfied...");
			}
		} else {
			System.out.println("sorry, not matching profile!!!");
		}

	}

}
