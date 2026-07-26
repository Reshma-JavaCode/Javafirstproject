package com.abstraction;

import java.util.Scanner;
/*
 * 1.Design a Java program to calculate discounts for different types of customers.
	Create an interface Discount.
	The interface contains the method:
	->Different customer types provide different discount percentages:
		Regular Customer → 5%
		Premium Customer → 15%
		VIP Customer → 25%
	->Accept the purchase amount and customer type from the user.
	->Apply the correct discount and display the final bill.
 */
public class DiscountDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter Purchase amount:");
		double amount= sc.nextDouble();
		
		System.out.println("Enter Customer Type: (1/2/3)");
		System.out.println("1.Regular Customer\n2.VIP Customer\n3.Premium customer");
		int ch= sc.nextInt();
		
		DiscountInterface d=null;
		
		
		switch(ch)
		{
		case 1->
		{
			d=new RegularCustomer();
		}
		case 2-> d=new VIPCustomer();
		case 3-> d=new PremiumCustomer();
		default->System.out.println("Invalid choice..");
		}
		
		double discount= d.calculateDiscount(amount);
		double finalBill= amount- discount;
		
		System.out.println("\nPurchase Amount : " + amount);
        System.out.println("Discount Amount : " + discount);
        System.out.println("Final Bill      : " + finalBill);
        
        sc.close();
	}

}
