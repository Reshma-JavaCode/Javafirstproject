package com.languagefundamentals.methods;

public class Operations {
	
	void add()
	{
		int a=10,b=20;
		System.out.println("Addition of two numbers: ");
		System.out.println(a+b);
	}
	void subtract()
	{
		float a=30.5f,b=20.5f;
		System.out.println("Subtraction of two numbers: ");
		System.out.println(a+b);
	}
	void multiply()
	{
		double a=10,b=20;
		System.out.println("Multiplication of two numbers: ");
		System.out.println(a*b);
	}
	void divide()
	{
		double a=40.44;
		int b=2;
		System.out.println("Division of two numbers: ");
		System.out.println(a/b);
	}
	void Modulus()
	{
		double a=40.44;
		int b=2;
		System.out.println("Reminder of two division numbers: ");
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		Operations op=new Operations();
		op.add();
		op.subtract();
		op.multiply();
		op.divide();
		op.Modulus();
	}

}
