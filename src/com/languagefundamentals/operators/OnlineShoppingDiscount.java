package com.languagefundamentals.operators;

public class OnlineShoppingDiscount {

	public static void main(String[] args) {
		boolean premiumMember = false;
		double amount = 6000;

		if(premiumMember || amount > 5000)
		{
		    System.out.println("Discount Applied");
		}
		
		//Eligible criteria for Placement Drive
		boolean hasBacklogs = false;
		double cgpa = 8.0;

		if(cgpa >= 7.0 && !hasBacklogs)
		{
		    System.out.println("Eligible for Placement Drive");
		}
	}

}
