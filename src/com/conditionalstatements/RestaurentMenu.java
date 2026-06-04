package com.conditionalstatements;

import java.util.Scanner;

public class RestaurentMenu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("********* Welcome to Our Restaurent ********");
		System.out.println();
		String res="";
		String itemName = "";
		double itemPrice = 0;
		double finalBill = 0;
		double price=500;
		String orderSummary="";
		do {
			System.out.println("Select category : (1/2)");
			System.out.println("1.veg");
			System.out.println("2.non-veg");
			int type=sc.nextInt();
			
		switch(type)
		{
		case 1 -> 
			{
				System.out.println("********** vegiterian Menu **********");
				System.out.println("choose food items: (1/2/3/4)");
				System.out.println("1.paneer tikka");
				System.out.println("2.Veg Biryani");
				System.out.println("3.veg Pulao");
				System.out.println("4.paneer tikka");
				int item1= sc.nextInt();
				
				switch(item1) {
				case 1 -> {
				    itemName = "Paneer Tikka";
				    itemPrice = 250;

				    System.out.println(itemName);
				    System.out.println("Cost per plate: " + itemPrice);

				    System.out.print("Enter Quantity: ");
				    int qty = sc.nextInt();

				    double total = itemPrice * qty;
				    
				    orderSummary += itemName + " x " + qty + " = " + total + "\n";
				    finalBill += total;
				    System.out.println("\nDetails:");
				    System.out.println("Item Name : " + itemName);
				    System.out.println("Quantity  : " + qty);
				    System.out.println("Bill: " + total);
				}
				case 2->
				{
					System.out.println("2.Veg Biryani");
					
					//System.out.println("Veg Biryani we will serve within 5 min");
					itemName = "Veg Biryani";
				    itemPrice = 300;

				    System.out.println(itemName);
				    System.out.println("Cost per plate: " + itemPrice);

				    System.out.print("Enter Quantity: ");
				    int qty = sc.nextInt();

				    double total = itemPrice * qty;
				    orderSummary += itemName + " x " + qty + " = " + total + "\n";
				    finalBill += total;
				    System.out.println("\nDetails:");
				    System.out.println("Item Name : " + itemName);
				    System.out.println("Quantity  : " + qty);
				    System.out.println("Bill: " + total);
				}
				case 3->
				{
					System.out.println("3.Veg Pulao");
					itemName = "Veg Pulao";
				    itemPrice = 350;

				    System.out.println(itemName);
				    System.out.println("Cost per plate: " + itemPrice);

				    System.out.print("Enter Quantity: ");
				    int qty = sc.nextInt();

				    double total = itemPrice * qty;
				    orderSummary += itemName + " x " + qty + " = " + total + "\n";
				    finalBill += total;
				    System.out.println("\nDetails:");
				    System.out.println("Item Name : " + itemName);
				    System.out.println("Quantity  : " + qty);
				    System.out.println("Bill: " + total);
				}
				case 4->
				{
					System.out.println("4.Rice with Mushroom Curry");
					itemName = "Rice with Mushroom Curry";
				    itemPrice = 400;

				    System.out.println(itemName);
				    System.out.println("Cost per plate: " + itemPrice);

				    System.out.print("Enter Quantity: ");
				    int qty = sc.nextInt();

				    double total = itemPrice * qty;
				    orderSummary += itemName + " x " + qty + " = " + total + "\n";
				    finalBill += total;
				    
				    System.out.println("\nDetails:");
				    System.out.println("Item Name : " + itemName);
				    System.out.println("Quantity  : " + qty);
				    System.out.println("Bill: " + total);
				}
				default-> System.out.println("Invalid Item");
				}
			}
		case 2 ->
		   {
			System.out.println("********* Non-vegiterian Menu ********");
			
			System.out.println("choose food items: (1/2/3/4)");
			System.out.println("1.Chicken Biryani");
			System.out.println("2.Mutton Biryani");
			System.out.println("3.Chicken Mandi");
			System.out.println("4.Egg Fried Rice");
			int item2= sc.nextInt();
			
			switch(item2) {
			case 1->{
				//System.out.println("1.Chicken Biryani");
				itemName = "Chicken Biryani";
			    itemPrice = 1000;

			    System.out.println(itemName);
			    System.out.println("Cost per plate: " + itemPrice);

			    System.out.print("Enter Quantity: ");
			    int qty = sc.nextInt();

			    double total = itemPrice * qty;
			    orderSummary += itemName + " x " + qty + " = " + total + "\n";
			    finalBill += total;
			    System.out.println("\nDetails:");
			    System.out.println("Item Name : " + itemName);
			    System.out.println("Quantity  : " + qty);
			    System.out.println("Bill: " + total);
				}
			case 2->
			{
				itemName = "Mutton Biryani";
			    itemPrice = 1500;

			    System.out.println(itemName);
			    System.out.println("Cost per plate: " + itemPrice);

			    System.out.print("Enter Quantity: ");
			    int qty = sc.nextInt();

			    double total = itemPrice * qty;
			    orderSummary += itemName + " x " + qty + " = " + total + "\n";
			    finalBill += total;
			    System.out.println("\nDetails:");
			    System.out.println("Item Name : " + itemName);
			    System.out.println("Quantity  : " + qty);
			    System.out.println("Bill: " + total);
			}
			case 3->
			{
				itemName = "Chicken Mandi";
			    itemPrice = 1600;

			    System.out.println(itemName);
			    System.out.println("Cost per plate: " + itemPrice);

			    System.out.print("Enter Quantity: ");
			    int qty = sc.nextInt();

			    double total = itemPrice * qty;
			    orderSummary += itemName + " x " + qty + " = " + total + "\n";
			    finalBill += total;
			    System.out.println("\nDetails:");
			    System.out.println("Item Name : " + itemName);
			    System.out.println("Quantity  : " + qty);
			    System.out.println("Bill: " + total);
			}
			case 4->
			{
				itemName = "Egg Biryani";
			    itemPrice = 500;

			    System.out.println(itemName);
			    System.out.println("Cost per plate: " + itemPrice);

			    System.out.print("Enter Quantity: ");
			    int qty = sc.nextInt();

			    double total = itemPrice * qty;
			    orderSummary += itemName + " x " + qty + " = " + total + "\n";
			    finalBill += total;
			    System.out.println("\nDetails:");
			    System.out.println("Item Name : " + itemName);
			    System.out.println("Quantity  : " + qty);
			    System.out.println("Bill: " + total);
			}
			default-> System.out.println("Invalid Item");
			}
		
			
		   }
		 default->  System.out.println("Invalid Food Type");
			}
		System.out.println("\nDo You want to order again?? (Y/N)");
		res= sc.next();
	}while(res.equalsIgnoreCase("Y"));
		System.out.println();
		System.out.print(orderSummary);
		System.out.println("-----------------------------");
		System.out.println("Final Bill: "+ finalBill);
		System.out.println();
		System.out.println("********* Thank You Visit Again ************");
		}
	}


