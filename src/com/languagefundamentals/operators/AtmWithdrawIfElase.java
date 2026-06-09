package com.languagefundamentals.operators;

import java.util.Scanner;

public class AtmWithdrawIfElase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double totalAmount=5000.25;
		
		System.out.println("Enter amount to withdraw:");
		double amount= sc.nextDouble();
		
		if(amount>0 && amount<=totalAmount)
		{
			System.out.println("Withdraw successfull");
			totalAmount= totalAmount-amount;
			System.out.println("Total Bank Balance is: "+totalAmount);
		}
		else
		{
			System.out.println("Insufficient Bank Balance");
		}
	}

}
