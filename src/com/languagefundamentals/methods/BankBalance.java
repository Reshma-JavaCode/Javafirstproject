package com.languagefundamentals.methods;

import java.util.Scanner;

public class BankBalance {
	
	//Bank balance,withdraw,deposit
	
	double balance=5000;
	static Scanner sc=new Scanner(System.in);
	
	void withDraw(double d) {
		
		balance = balance-d;
		System.out.println("Total balance is: "+balance);
	}
	
	void deposit(double d) {
		
		balance = balance+d;
		System.out.println("Total balance is: "+balance);
	}
	public static void main(String[] args) {
		
		BankBalance b=new BankBalance();
		
		System.out.println("Current bank balance is: "+b.balance);
		
		System.out.println("enter amount to deposit:");
		double d1=sc.nextDouble();
		b.deposit(d1);
		
		System.out.println("enter amount to withdraw:");
		double d2=sc.nextDouble();
		b.withDraw(d2);
		
		
		
	}

}
