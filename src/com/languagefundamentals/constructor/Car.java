package com.languagefundamentals.constructor;

public class Car {

	String model;
	double price;
	static String org_name="VCubes";
	
	Car(String model,double price,String org_name)
	{
		System.out.println("3 Paramtr constructor");
		this.model=model;
		this.price=price;
		this.org_name=org_name;
	}
	Car(String model,double price)
	{
		System.out.println("2 Paramtr constructor");
		this.model=model;
		this.price=price;
//		this.org_name=org_name;
	}
	public static void main(String[] args) {
		Car c1=new Car("Hyundai",1500000,"RRR");
		c1.show();
//		//o/p:
//		3 Paramtr constructor
//		Model= Hyundai
//		Price= 1500000.0
//		org name= RRR
		Car c2=new Car("Hero",200000);
		c2.show();
		//output:
//		2 Paramtr constructor
//		Model= Hero
//		Price= 200000.0
//		org name= RRR since,once static data changed it applicable to all
		//means this and constructor no gng to impact on static data
		//constructor is mainly to initialize instance data only
	}
void show()
{
	System.out.println("Model= "+model);
	System.out.println("Price= "+price);
	System.out.println("org name= "+org_name);
}
}
