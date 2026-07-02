package com.oops.encapsulation;

import java.util.Scanner;

public class BankAccount {

	private long accNumber;
	private String accHolder;
	private double balance;

	//No arg constructor
	public BankAccount() {
		System.out.println("********Welcome to RMR Bank*******\n");
	}

	// Parameterized constructor
	public BankAccount(long accNumber, String accHolder, double balance) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	// Setters & Getters
	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		if (accNumber > 0)
			this.accNumber = accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance > 0)
			this.balance = balance;
	}

	//Withdraw
	public void withdraw(double withdraw) {
		
		if(withdraw > 0 && withdraw <= balance)
		{
		    balance -= withdraw;
		
			System.out.println(withdraw + " withdrawn successfully.");
		} 
		
		else {
			
			System.out.println("Insuuficient balance!!!");
		}
	}

	// Deposit
	public void deposit(double amount) {

		if (amount > 0) {
			
			balance = balance + amount;
			System.out.println(amount + " deposited successfully.");
		} 
		
		else
			System.out.println("Invalid deposit amount");

	}

	// Display Method
	public void display() {

		System.out.println("\nAccount Details");
		System.out.println("------------------------");
		System.out.println("Account Number : " + accNumber);
		System.out.println("Account Holder : " + accHolder);
		System.out.println("Balance        : " + balance);
	}

}
