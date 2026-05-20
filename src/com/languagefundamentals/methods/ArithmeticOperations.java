package com.languagefundamentals.methods;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		char c='A';
		//char add=(char) (c + 1);
		int add=c+10;
		System.out.println(add);
		System.out.println((c/10));
		
		char ch = (char)(c / 10); //
		System.out.println(ch); // B
		
		char c2=650;
		char ch2 = (char)(c2 / 10);
		System.out.println(ch2);
		System.out.println(c2/10);
		//strings arithmetic operations are not possible
		
		byte b1=120,b2=8;
//		byte b=b1+b2; here we need to do casting
		byte b=(byte) (b1*b2); //byte value for 128 is -128
		//range -128 to 127
		System.out.println(b);
		
		//here it result directly conv to int
		System.out.println(b1*b2); //128 int value
		
		short s1=123,s2=123;
		System.out.println(s1+s2);
		short s3=(short) (s1+s2);
		
		
	
	}

}
