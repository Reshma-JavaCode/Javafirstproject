package com.languagefundamentals;

public class LiteralsDemo1 {

	public static void main(String[] args) {

		// 1.*******************Integral literals***********************

		int i1 = 12;
		int i2 = 012, i3 = 0X12, i4 = 0b1010;
		System.out.println("1) Integral Literals");
		System.out.println("--------------------");
		System.out.println(i1);// decimal literal
		System.out.println(i2);// octal literal
		System.out.println(i3);// hexadecimal literal
		System.out.println(i4 + "\n");// binary literal

		// *******************2)Floating literals****************************

		// Note:Floating literals doesn't have decimal,octal,hexa-dec and binary

		float f1 = 123; // implicit type casting :int to float 123 to 123.0
		// float f2=12.4; CE:Type mismatch: cannot convert from double to float
		float f3 = 12f; // 12.0
		float f4 = 12.4f; // 12.4
		float f5 = 0123; // octal to float 83.0
		// float f6=0123.5; CE:Type mismatch: cannot convert from double to float
		float f7 = 0123.5f; // no octal for floating values so,o/p: 123.5
		float f8 = 0x123; // hexa-decimal to float 291.0
		float f9 = 0x123F; // here F also consider as hexa-decimal f=15 so,o/p=4671
		// float f=0x123.5F; CE:Invalid hex literal number
		float f = 0b1010;

		System.out.println("2) Floating Literals");
		System.out.println("--------------------");
		System.out.println(f1);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f9);
		System.out.println(f1);
		System.out.println(f + "\n");

		// *********************3)char literals***************************

		char c1 = 'b';
		char c2 = 65;
		char c3 = '\u0b00';
		System.out.println("3) Char Literals");
		System.out.println("--------------------");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3 + "\n");

		// *********************4)String literals***************************
		
		String s = "Reshu";
		System.out.println("4) String Literals");
		System.out.println("--------------------");
		System.out.println(s +"\n");

		// *********************5)null literals***************************
		System.out.println("5) null Literals");
		System.out.println("--------------------");
		String s2 = null;
		System.out.println(s2+"\n");
		// System.out.println(s2.length()); NullPointerException
		// since,s2 is null,for null objects if we do operation like length() is
		// NullPointerException

		// *********************6)boolean literals***************************
		boolean married = true;
		System.out.println("6)boolean Literals");
		System.out.println("--------------------");
		if (married) {
			System.out.println(s + " is Married");
		} else {
			System.out.println(s + " is not married");
		}
	}

}
