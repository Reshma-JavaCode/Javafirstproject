package com.abstraction;

public class RegularCustomer implements DiscountInterface {

	@Override
	public double calculateDiscount(double amount) {
		return amount*0.05;
	}

}
