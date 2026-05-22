package com.languagefundamentals.constructor;

 
class CarParameterizedConstructor {

	String brand;
	double price;
	CarParameterizedConstructor(){
		System.out.println("no args constructor called");
		brand="suzuki";
		price=200000.00;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		CarParameterizedConstructor c=new CarParameterizedConstructor();
		c.display();
	}
	void display()
	{
		System.out.println("car brand= "+brand);
		System.out.println("car price= "+price);
	}

}
