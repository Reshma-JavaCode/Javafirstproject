package com.conditionalstatements;

import java.util.Scanner;

public class AtmMenu {

	public static void main(String[] args) {

		double balance = 10000;
		System.out.println("********* Welcome to ATM *********");
		System.out.println("Here is the ATM Menu like:(1/2/3/4)");
		
		Scanner sc = new Scanner(System.in);
		int menu;
		String res = "";

		do {
			System.out.println("Please Enter Your Option:\n 1.Check the Balance \n 2.Deposit \n 3.Withdraw \n 4.Exit");
			menu = sc.nextInt();
			switch (menu) {
			case 1 -> {
				System.out.println("Your Current Balance is: " + balance);
			}
			case 2 -> {
				System.out.println("enter the amount to deposit: ");
				double deposit = sc.nextDouble();
				balance = balance + deposit;
				System.out.println("Deposit successufull");
				System.out.println("After deposit your balance is: " + balance);
			}
			case 3 -> {
				System.out.println("enter the amount to Withdraw: ");
				double withdraw = sc.nextDouble();
				if (balance > withdraw) {
					balance = balance - withdraw;
					System.out.println("Withdraw successfull");
					System.out.println("After withdraw your balance is: " + balance);
				} else {
					System.out.println("Insufficient Balance");
				}
			}
			case 4 -> {
				System.out.println("Exit");
				System.out.println("******** Thank You Visit Again *******");
				//break;
				return;
			}
			default -> {
				System.out.println("Invalid Menu");
			}

			}
			System.out.println("Do you want to continue: (Y/N)");
			res = sc.next();
		} while (res.equalsIgnoreCase("y"));

	}

}
