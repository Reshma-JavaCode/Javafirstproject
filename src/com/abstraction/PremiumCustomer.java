package com.abstraction;

public class PremiumCustomer implements DiscountInterface{

	@Override
	public double calculateDiscount(double amount) {
		return amount*0.15;
	}

}
