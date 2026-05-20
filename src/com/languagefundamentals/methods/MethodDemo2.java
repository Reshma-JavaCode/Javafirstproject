package com.languagefundamentals.methods;

public class MethodDemo2 {
	
	//No Return type + With Arguments
	public static void add(int a, int b)
	{
		System.out.println("Addition of 2 numbers is: ");
		System.out.println(a+b);
	}
	static void sub(float a, double b)
	{
		System.out.println("Addition of 2 numbers is: ");
		System.out.println(a-b);
	}
	void mul(char a, float b)
	{
		System.out.println("Multiplication of 2 numbers is: "+a*b);
		//System.out.println(a*b);
	}
	void div(double a, int b)
	{
		System.out.println("Division of 2 numbers is: ");
		System.out.println(a/b);
	}
	void mod(double a, int b)
	{
		System.out.println("Modulo of 2 numbers is: ");
		System.out.println(a%b);
	}
	void add1(String a,int b)
	{
		System.out.println("Addition of 2 numbers is: ");
		System.out.println(a+b);
	}
	void add2(byte i,byte b)
	{
		System.out.println("Addition of 2 numbers is: ");
		System.out.println(i+b);
	
	}
	public static void main(String[] args) {
		MethodDemo2 m=new MethodDemo2();
		add(10, 20);
		sub(500,400);
		m.mul('A',3);
		m.div(99,5);
		m.mod(99, 5);
		m.add1("abc", 10);
		m.add2((byte)500,(byte) 100);
	}

}
