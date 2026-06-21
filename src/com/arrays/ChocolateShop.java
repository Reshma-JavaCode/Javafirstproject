package com.arrays;

import java.util.Scanner;

public class ChocolateShop {
	static int total = 0;
	static int priceRahulHas = 20;
	static int chocCount = 0;

	public static void main(String[] args) {

		int chocPrice = 2;
		int wrappers = 0, q;
		int remainingWrappers = 0;
		String res2, res;
		String c = " ";

		Scanner sc = new Scanner(System.in);
		System.out.println("*********WELCOME TO MR CHOCOLATATE SHOP*********");
		do {

			System.out.println("Rahul has amount: RS." + priceRahulHas);
			System.out.println("Rahul, Do you Want to buy a chocolates with Money/Wrappers?");
			System.out.println("With Money Type (M)");
			System.out.println("With Wrappers Type (W)");
			res2 = sc.next();
			res = res2.toUpperCase();
			switch (res) {
			case "M" -> {
				System.out.println("How many Chococolate do you want ??");
				q = sc.nextInt();// 7

				// total cost
				total = q * chocPrice;
				// System.out.println("Total val= "+total);
				if (total <= priceRahulHas) {
					chocCount += q;// 7
					wrappers += q;// 7
					System.out.println("Total price Rs. " + total);
					System.out.println("Number of chocolates u got for " + total + " is =" + q);

					// after buying rahul consisist amount
					priceRahulHas -= total;
					System.out.println("Rahul, Your Amount after buying Rs. " + priceRahulHas);
				}

				else {
					System.out.println("Rahul,u do not has sufficient amount to buy choc...");
				}

			}
			case "W" -> {
				// chocolates ate by rahul = number of choc wrappers
				// wrappers=chocCount;
				System.out.println("Chocolate wrappers count:  " + wrappers);
				if (wrappers >= 3)// 7
				{
					int freeChocolates = wrappers / 3;// 2

					chocCount += freeChocolates;// 9

					wrappers = (wrappers % 3) + freeChocolates;// 1+2

					System.out.println("Free chocolates got: " + freeChocolates);
					//System.out.println("Now  count= " + chocCount);
					System.out.println("Remaining wrappers: " + wrappers);
					remainingWrappers = freeChocolates;
				} else {
					System.out.println("Rahul had " + remainingWrappers + " Wrappers");
					System.out.println("Need 3 wrappers per chocolate....");
				}
			}
			default -> System.out.println("Invalid input...");
			}

			System.out.println("\nDo You Want to continue(Y/N)....?");
			c = sc.next();
		} while (c.equalsIgnoreCase("Y"));
		System.out.println("Total chocolates : " + chocCount);
		System.out.println("Rahul has amount atlast Rs. " + priceRahulHas);

		sc.close();
	}

}
