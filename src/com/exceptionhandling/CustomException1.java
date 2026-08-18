package com.exceptionhandling;

import java.util.Scanner;


/*
Q) Create a Java program to withdraw money from a bank account.
Throw an exception if the withdrawal amount is greater than the balance.
Handle the exception and display an appropriate message.
*/

public class CustomException1 {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);

		double bankBalance = 5000;

		System.out.println("enter withdraw amount:");
		double withdraw = sc.nextDouble();

		try {
			if (withdraw > bankBalance) {
				
				throw new InSufficientBalanceException("In sufficient balance!!");

			}
			System.out.println("Withdraw succeed");
			System.out.println("Remaining bank balance: " + (bankBalance - withdraw));

		} catch (InSufficientBalanceException e) {
			System.err.println(e.getMessage());
		}

		sc.close();
	}

}
