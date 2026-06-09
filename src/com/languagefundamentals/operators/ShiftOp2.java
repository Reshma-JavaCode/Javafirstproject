package com.languagefundamentals.operators;

//WAP to apply shift operators
public class ShiftOp2 {

	public static void main(String[] args) {
		
		int a=5,b=2;
		
		//left shift= n*2^k; n=5,k=2;
		System.out.println("****Shift Operators******");
		System.out.println("Left shift op value: "+(a<<b));
		System.out.println("Right shift op value: "+(a>>b));
		
		//Right shift= n/(2^k); n=7,k=5;
		int x=7,y=5;
		System.out.println("Right shift op value: "+(x>>y));
		
		
	}

}
