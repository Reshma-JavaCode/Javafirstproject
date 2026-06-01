package com.operators;

import java.util.Scanner;

public class ShoppingCart {
		double price,total_amnt; 
		int quantity;
		static int items=1;
		String pr_name;
		static Scanner sc=new Scanner(System.in);
		
		public ShoppingCart() {
			
		}
		public ShoppingCart(int n) {
			
			//loop to find each product price
			for(int i=1;i<=n;i++)
			{
			System.out.println();
			System.out.println(items+")Enter product name: ");
			
			pr_name=sc.nextLine();
			
			System.out.println(pr_name+" Price:");
			price=sc.nextDouble();
			System.out.println(pr_name+" Quantity: ");
			quantity=sc.nextInt();
			
			//calculating total price
			total_amnt=total_amnt+(price* quantity);
			
			//to know items count
			items++;
			System.out.println("____________________________");
			sc.nextLine();
			}
			
		}
		
		
	public static void main(String[] args) {
	
		//ShoppingCart obj=new ShoppingCart();
		double final_amnt;
		
		//Number of items
		System.out.println("Enter number of products: ");
		int p_no = sc.nextInt();
		sc.nextLine();
		
		System.out.println("____________________________");
		
		//To find total cost--Parameterized constructor
		ShoppingCart obj2=new ShoppingCart(p_no);
		
		//to find total amount-discount --return type method
		final_amnt= obj2.finalBill(obj2.total_amnt);
		System.out.println("Final payable amont after discount: "+final_amnt);
		System.out.println("\n____________________***Thank You***____________________");
		//System.out.println("\n*************Thank You***********");
	}

	double finalBill(double t)
	{
		int d;
		double discount, payable_amnt;
		d= (int)(t/1500);
		discount= d*300;
		
		System.out.println("\n*************Product details***********\n");
		System.out.println("Number of items: "+(items-1));
		System.out.println("Total amount: "+t);
		System.out.println("Discount applied on total amount: "+discount);
		
		payable_amnt= t - discount;
		
		return payable_amnt;
	}

}
