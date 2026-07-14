package com.shoppingplatform;

public class Clothing extends Product {

	String size;
	String color;
	String fabricType;

	public Clothing(int productId, String productName, double productPrice, String size, String color,
			String fabricType) {
		super(productId, productName, productPrice);
		this.size = size;
		this.color = color;
		this.fabricType = fabricType;

	}

	@Override
	public void displayProductDetails() {

		super.displayProductDetails();

		System.out.println("Size : " + size);
		System.out.println("Color : " + color);
		System.out.println("Fabric : " + fabricType);
	}

}
