package com.languagefundamentals.operators;

public class ternaryOperator {

	public static void main(String[] args) {
		int a=10,b=100,c=200;
		
		int max= (a>b)? a : b;
		System.out.println("maximum number in a and b is: "+max);
		
		//(a>b) ? max(a,c) : max(b,c)
		int max2= (a>b)? ((a>c)?a:c):((b>c)?b:c);
		System.out.println("maximum number in a and b and c is: "+max2);
		
		
	}

}
