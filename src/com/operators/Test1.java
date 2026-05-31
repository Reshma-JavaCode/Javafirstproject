package com.operators;

public class Test1 {

	//Arithmetic operators
	public static void main(String[] args) {
		int a=6;
		int b=5;
		System.out.println("initially a= "+a);
		System.out.println("initially b= "+b);
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(+b);
		System.out.println(-b);
		
		//Addition
		System.out.println("add= "+a+b);
		System.out.println("add= "+(a+b));//BODMAS
		
		//Subtractions
		//CE:The operator - is undefined for the argument type(s) String, int
		//System.out.println("add= "+a-b);
		System.out.println("sub= "+(a-b));
		
		//mul
		System.out.println("Mul= "+a*b);//mul more priority so, evaluation starts from rigt to left
		System.out.println("div= "+a/b);
		System.out.println("rem= "+a%b);
		
	}

}
