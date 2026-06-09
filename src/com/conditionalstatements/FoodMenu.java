package com.conditionalstatements;

import java.util.Scanner;

public class FoodMenu {

	// items price
	static int pizzaPrice = 250;
	static int burgerPrice = 120;
	static int sandwichPrice = 100;
	static int coffePrice = 80;

	// display info along with total bill
	static void displayInfo(int ch, double itemPrice, int q) {
		System.out.println("Item: " + ch);
		System.out.println("Price: ₹" + itemPrice);
		System.out.println("Quantity: " + q);
		System.out.println("Total Bill: ₹" + (itemPrice * q));
	}

	// Menu using switch block
	static void getFoodInfo(int ch, int q) {
		switch (ch) {
		case 1 -> {
			displayInfo(ch, pizzaPrice, q);
			// instead of repeating lines, using method() for calculations
			//System.out.println("Item: "+ch);
			//System.out.println("Price: ₹"+pizzaPrice);
			//System.out.println("Quantity: "+q);
			//System.out.println("Total Bill: ₹"+(pizzaPrice*q));
		}
		case 2 -> {
			displayInfo(ch, burgerPrice, q);
		}
		case 3 -> {
			displayInfo(ch, sandwichPrice, q);
		}
		case 4 -> {
			displayInfo(ch, coffePrice, q);
		}
		default -> System.out.println("Invalid Choice");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** RMR Restaurent ****");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. Pizza - ₹" + pizzaPrice);
		System.out.println("2. Burger - ₹" + burgerPrice);
		System.out.println("3. Sandwich - ₹" + sandwichPrice);
		System.out.println("4. Coffee - ₹" + coffePrice);
		System.out.println();
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		System.out.println("Enter Quantity");
		int q = sc.nextInt();
		getFoodInfo(choice, q);
	}

}
