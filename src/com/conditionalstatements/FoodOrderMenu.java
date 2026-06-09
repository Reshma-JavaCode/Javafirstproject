package com.conditionalstatements;

import java.util.Scanner;

public class FoodOrderMenu {

	// items price
	static int pizzaPrice = 250;
	static int burgerPrice = 120;
	static int sandwichPrice = 100;
	static int coffePrice = 80;

	static double getFoodInfo(int ch, int q) {
		double totalBill = 0;
		totalBill = switch (ch) {
		case 1 -> {
			System.out.println("Item : " + ch);
			System.out.println("Price :₹" + pizzaPrice);
			System.out.println("Quantity : " + q);
			totalBill = pizzaPrice * q;
			// System.out.println("Total Bill: "+double(pizzaPrice*q));
			yield totalBill;
		}
		case 2 -> {
			System.out.println("Item : " + ch);
			System.out.println("Price :₹" + burgerPrice);
			System.out.println("Quantity: " + q);
			// System.out.println("Total Bill: "+(burgerPrice*q));
			totalBill = burgerPrice * q;
			yield totalBill;
		}
		case 3 -> {
			System.out.println("Item : " + ch);
			System.out.println("Price :₹" + sandwichPrice);
			System.out.println("Quantity : " + q);
			// System.out.println("Total Bill: "+(sandwichPrice*q));
			totalBill = sandwichPrice * q;
			yield totalBill;
		}
		case 4 -> {
			System.out.println("Item : " + ch);
			System.out.println("Price :₹" + coffePrice);
			System.out.println("Quantity : " + q);
			// System.out.println("Total Bill: "+(coffePrice*q));
			totalBill = coffePrice * q;
			yield totalBill;
		}
		default -> {
			System.out.println("Invalid Choice");
			yield 0;
		}
		};
		return totalBill;
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
		Double totalBill = getFoodInfo(choice, q);

		System.out.println("TotalBill :₹" + totalBill);

	}

}
