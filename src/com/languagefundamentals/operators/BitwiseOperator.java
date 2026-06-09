package com.languagefundamentals.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a=18,b=45;
		
		//bitwise op work with numbers
		System.out.println(1&1);
		System.out.println(0&1);
		System.out.println(1&0);
		System.out.println(0&0);
		System.out.println("-----------------");
		
		//bitwise op work with conditions also
		System.out.println(a&b);//0
		System.out.println(a|b);//63
		System.out.println(a^b);//63
		System.out.println(~(a|b));//-64 -(n+1)
		
	}

}
