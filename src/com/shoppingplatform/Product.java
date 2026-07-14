package com.shoppingplatform;

public class Product implements ProductInterface {

	int productId;
	String productName;
	double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public void displayProductDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
	}

}
