package com.abstraction;

public class CreditCard implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Amount "+amount+" Your Payment done through CreditCard");
	}
	
}
