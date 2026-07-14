package com.shoppingplatform;

public class Grocery extends Product {

	String expiryDate;
	double weight;

	public Grocery(int productId, String productName, double productPrice, String expiryDate, double weight) {
		super(productId, productName, productPrice);
		this.expiryDate = expiryDate;
		this.weight = weight;
	}

	@Override
	public void displayProductDetails() {

		super.displayProductDetails();

		System.out.println("Expiry Date : " + expiryDate);
		System.out.println("Weight : " + weight + " Kg");
	}

}
