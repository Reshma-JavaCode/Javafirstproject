package com.shoppingplatform;

public class Main {

	public static void main(String[] args) {

		// Can't achieve abstraction
		// Product normal class
		// To achieve abstraction we need interface/abstract class
		// Product p3 = new Grocery(103, "Rice", 850, "20-12-2026", 10);

		// ToAchieve Abstraction give interface ProductInterface as reference

		ProductInterface p1 = new Electronics(101, "Laptop", 60000, "Dell", 2);

		ProductInterface p2 = new Clothing(102, "Long Frock", 3500, "XL", "Green", "Georget");

		ProductInterface p3 = new Grocery(103, "Rice", 850, "20-12-2026", 10);

		// here when we open method-> displayProductDetails
		// it won't open implementation
		// it go to interface->ProductInterface-> where there is no implemenation
		// so,Complex data hidden achieved abstraction

		System.out.println("------ Electronics ------");
		p1.displayProductDetails();

		System.out.println("\n------ Clothing ------");
		p2.displayProductDetails();

		System.out.println("\n------ Grocery ------");
		p3.displayProductDetails();

	}
}
// OutPut:
//	------ Electronics ------
//	Product ID: 101
//	Product Name: Laptop
//	Product Price: 60000.0
//	Brand: Dell
//	Warranty Period: 2 Years
//
//	------ Clothing ------
//	Product ID: 102
//	Product Name: Long Frock
//	Product Price: 3500.0
//	Size : XL
//	Color : Green
//	Fabric : Georget
//
//	------ Grocery ------
//	Product ID: 103
//	Product Name: Rice
//	Product Price: 850.0
//	Expiry Date : 20-12-2026
//	Weight : 10.0 Kg
//
