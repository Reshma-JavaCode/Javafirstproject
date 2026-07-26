package com.abstraction;

public class VIPCustomer implements DiscountInterface {

	@Override
	public double calculateDiscount(double amount) {
		return amount*0.25;
	}

}
