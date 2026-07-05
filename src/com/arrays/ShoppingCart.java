package com.arrays;

import java.util.Scanner;

public class ShoppingCart {

	//Total bill
	static int totalPrice(int prices[])
	{
		int total=0;
		
		for(int i=0;i<prices.length;i++)
		{
		  total += prices[i];
		}
		
		return total;
	}
	
	//Most expensive and cheapest cost
	static void maximumMinPrice(int[] prices)
	{
		int max=prices[0];
		int min=prices[0];
		
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]>max)
		       max = prices[i];
			
			if(prices[i]<min)
				min= prices[i];
		}
		
		System.out.println("Most Expensive product price= "+max);
		System.out.println("Cheapest cost= "+min);
	}
	
	//Product count
	static int productCount(int[] prices)
	{
		int count=0;
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]>1000)
				count++;
		}
		
		return count;
	}
	
	//To Search price
	static boolean searchProductPrice(int[] prices, int search)
	{
		
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]==search)
			{
				return true;
			}
		}
		
		return false;
	}
	
	//Main method
	public static void main(String[] args) {

		int prices[]= new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 5 product prices: ");
		
		for(int i=0;i<prices.length;i++)
		{
			prices[i]= sc.nextInt();
		}
		
		//Total bill
		int total= totalPrice(prices);
		System.out.println("Total Bill= "+total);
		
		//max min
		 maximumMinPrice(prices);
		 
		 //Count >Rs.1000s
		 int count= productCount(prices);
		 System.out.println("product count morethan Rs.1000= "+count);
		 
		 //Search price
		 System.out.println("Enter price to search:");
		 int search= sc.nextInt();
		 boolean found=searchProductPrice(prices,search);
		 if(found)
		 {
		System.out.println("Price found");
		 }
		 else
			 System.out.println("Not found");
		
	}

}
