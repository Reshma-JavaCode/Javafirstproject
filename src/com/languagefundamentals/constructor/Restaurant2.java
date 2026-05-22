package com.languagefundamentals.constructor;

import java.util.Scanner;

public class Restaurant2 {
	String name;
	int quantity;
	double price;
	static Scanner sc=new Scanner(System.in);
	
	
	Restaurant2(String name,int quantity,double price)
	{
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public Restaurant2() {
		System.out.println("enter customer name: ");
		name=sc.nextLine();
		System.out.println("enter quantity: ");
		quantity=sc.nextInt();
		System.out.println("enter price: ");
		price=sc.nextDouble();	
		sc.nextLine();   // removes pending Enter
	}
	public static void main(String[] args) {
		for(int i=1;i<4;i++)
		{
		//take inputs
		Restaurant2 r=new Restaurant2();
		//initialize values
		Restaurant2 r4=new Restaurant2(r.name,r.quantity,r.price);
		//calls calculate method
		r4.calculateBill();
		}
		
//		Restaurant2 r1=new Restaurant2("Reshu",3,300);
//		r1.calc();
//		Restaurant2 r2=new Restaurant2("soni",4,500);
//		r2.calc();
//		Restaurant2 r3=new Restaurant2("fouziya",4,1300);
//		r3.calc();
	}
void calculateBill()
{
	double bill=price*quantity;
	System.out.println("bill of "+name+" is: " +bill);
}
}
