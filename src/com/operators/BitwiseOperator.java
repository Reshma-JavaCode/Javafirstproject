package com.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a=18,b=45;
		
		System.out.println(1&1);
		System.out.println(a&b);//0
		System.out.println(a|b);//63
		System.out.println(a^b);//63
		System.out.println(~(a|b));//-64 -(n+1)
		
	}

}
