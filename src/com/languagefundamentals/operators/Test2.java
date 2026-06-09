package com.languagefundamentals.operators;

public class Test2 {
	public static void main(String[] args) {
		int a=5,b=6;
		
		System.out.println("a= "+a++);//a=5 prints then a++ i.e a=6
		System.out.println("a= "+a); //6
		
	//	System.out.println(++a);//7
		System.out.println(b--);//op=6 b=5
		System.out.println(--b);//op=4 b=4
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println(++a + b--+ a++ + --a);
		
		
		
		
		
	}
}
