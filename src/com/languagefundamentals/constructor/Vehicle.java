package com.languagefundamentals.constructor;

public class Vehicle {

	String name;
	double price;
	Vehicle()
	{
		System.out.println("parent no args");
	}
//	Vehicle(String name,double price)
//	{
//		System.out.println("Vehicle parent para constrctr");
//		this.name=name;
//		this.price=price;
//	}
	public static void main(String[] args) {
		
	}

}
class Bike extends Vehicle{
	Bike()
	{
		System.out.println("Bike child constrctr with no args");
	}
	Bike(String name,double price)
	{
		//super(name,price);
		System.out.println("bike child para constrctr");
		super.name=name;
		super.price=price;
	}
public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println("name: "+b.name);
		System.out.println("price: "+b.price+"\n");
		
		Bike c=new Bike("ss",99999D);
		System.out.println("name: "+c.name);
		System.out.println("price: "+c.price);
//	output:	Vehicle parent para constrctr
//		bike child para constrctr
//		name: ss
//		price: 99999.0
		
	}
}

