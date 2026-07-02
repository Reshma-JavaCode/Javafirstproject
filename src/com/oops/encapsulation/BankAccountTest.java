package com.oops.encapsulation;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount b2 = new BankAccount();
		BankAccount b = new BankAccount(101, "Reshma", 10000);

		Scanner sc = new Scanner(System.in);

		double withdraw, depo;
		String s = " ";

		do {
			System.out.println("enter the choice:");
			System.out.println("1.Withdraw\n2.Deposit\n3.Account Details");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				// withdraw
				System.out.println("Enter Amount to withdraw: ");
				withdraw = sc.nextDouble();
				b.withdraw(withdraw);
				System.out.println("Current Balance: " + b.getBalance());
			}

			case 2 -> {
				// Deposit
				System.out.println("Enter Amount to deposit: ");
				depo = sc.nextDouble();
				b.deposit(depo);
				System.out.println("Current Balance: " + b.getBalance());

			}

			case 3 -> {
				// to display details
				b.display();
			}

			default -> System.out.println("Invalid choice!!!");

			}

			System.out.println("Do you want to continue??(Y/N)");
			s = sc.next();

		} while (s.equalsIgnoreCase("y"));
		sc.close();

	}

}
