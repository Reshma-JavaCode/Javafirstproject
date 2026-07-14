package com.shoppingplatform;

public class Electronics extends Product {

	String brand;
	int warrantyPeriod;

	public Electronics(int productId, String productName, double productPrice, String brand, int warrantyPeriod) {
		super(productId, productName, productPrice);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public void displayProductDetails() {
		super.displayProductDetails();

		System.out.println("Brand: " + brand);
		System.out.println("Warranty Period: " + warrantyPeriod + " Years");
	}

}
