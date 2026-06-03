package com.operators;

public class BitwiseOp3 {
	public static void main(String[] args) {
		
	int a=10,b=20;
	
	System.out.println("********Bitwise Operators********");
	System.out.println("Bitwise AND: "+(a&b));
	System.out.println("Bitwise OR: "+(a|b));
	System.out.println("Bitwise XOR: "+(a^b));
	
	//~n === -(n+1) ---> ~10 = -(10+1) = -11
	System.out.println("Bitwise tilt: "+(~a));
	
	}
}
