package com.languagefundamentals;

import java.util.Scanner;


class Customer{
	String sname;
	long mbl;
	Adress a=new Adress();
}
class Adress{
	int flat;
	String street,city;
	long pincode;
	
}
public class UserDefinedDT {
	public static void main(String[] args)
	{
		Customer obj=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Customer name:");
		obj.sname=sc.next();
		System.out.println("enter flat number :");
		obj.a.flat=sc.nextInt();
		
		System.out.println("Customer name:"+obj.sname);
		System.out.println("flat number:"+obj.a.flat);
		
	}

}
