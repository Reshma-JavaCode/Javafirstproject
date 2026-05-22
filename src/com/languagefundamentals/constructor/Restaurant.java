package com.languagefundamentals.constructor;

import java.util.Scanner;

public class Restaurant {

	String customer_name,food_item;
	int quantity;
	double price;
	static Scanner sc=new Scanner(System.in);
	
	Restaurant() {
		System.out.println("no args constructor");
		System.out.println("enter customer name: ");
		customer_name=sc.nextLine();
		System.out.println("enter food item name: ");
		food_item=sc.nextLine();
		System.out.println("enter quantity: ");
		quantity=sc.nextInt();
		System.out.println("enter price: ");
		price=sc.nextDouble();	
	}
	
	Restaurant(String customer_name,String food_item,int quantity,double price)
	{
		//enterDetails();	
		System.out.println("para constructor");
		this.customer_name=customer_name;
		this.food_item=food_item;
		this.quantity=quantity;
		this.price=price;
		calculateBill();
	}
	
//	void enterDetails()
//	{
//		
//		
//	}
	void calculateBill()
	{
		double bill=quantity*price;
		System.out.println("Total bill of customer is: "+bill);
	}
	
	public static void main(String[] args) {
		
		Restaurant r1=new Restaurant();
//		System.out.println("enter customer name: ");
//		r1.customer_name=sc.nextLine();
//		System.out.println("enter food item name: ");
//		r1.food_item=sc.nextLine();
//		System.out.println("enter quantity: ");
//		r1.quantity=sc.nextInt();
//		System.out.println("enter price: ");
//		r1.price=sc.nextDouble();	
		
		Restaurant r2=new Restaurant(r1.customer_name,r1.food_item,r1.quantity,r1.price);
		Restaurant r3=new Restaurant();
		
		Restaurant r4=new Restaurant(r3.customer_name,r3.food_item,r3.quantity,r3.price);
		
		//r2.calculateBill();
//		for(int i=0;i<3;i++)
//		{
//			System.out.println("Enter Customer Details: ");
//			r1.enterDetails();
//		}
//		
	}

}
