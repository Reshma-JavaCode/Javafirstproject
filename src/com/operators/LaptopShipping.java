package com.operators;

public class LaptopShipping {

	public static void main(String[] args) {
		
		int laptop=100, shipping=45;
		
		//remaining laptops
		int remaining= laptop-shipping;
		System.out.println("Remaining: "+remaining);
		
		System.out.println(remaining>50);
		System.out.println(remaining==55);
		System.out.println(remaining<60);
		System.out.println(remaining-50);
	}

}
