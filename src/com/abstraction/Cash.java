package com.abstraction;

public class Cash implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Amount "+amount+" Your Payment done through Cash");
	}
	
}
