package com.languagefundamentals;

public class DataTypes2 {

	byte b = (byte) 257;

	// float f=25.56;
	// Type mismatch: cannot convert from double to float
	float f = 25.56748493939099F;
	double d = 25.567948499433D;

	// char ch='Ba'; Invalid character constant
	char c = 'A';
	// int to char
	char c1 = 97;
	char c2 = '\u1010';

	// Boolean
	boolean bl = true;
	/* 
	boolean b2 = TRUE;
	boolean b3 = FALSE;
	boolean b4 = True;
	boolean b5 = False;
	boolean b6 = "true";
	boolean b7 = "false";
	boolean b8 = 0;
	boolean b9 = 1;
	*/

	int i = 'a';
  short s='a';
  byte b2='a';
  long l='A';
  float f2='a';
  double d2='b';
	public static void main(String[] args) {
		// Explicit type casting -->integer to byte
		DataTypes2 obj = new DataTypes2();
		System.out.println("byte value:" + obj.b);
		System.out.println("float value:" + obj.f);
		System.out.println("double value:" + obj.d);
		System.out.println("char value:" + obj.c);
		System.out.println("ASCII value:" + obj.c1);// a
		System.out.println("Unicode value:" + obj.c2);
		System.out.println("char in int value:" + obj.i);// 97
		System.out.println("char in short value:" + obj.s);// 97
		System.out.println("char in byte value:" + obj.b2);// 97

		System.out.println("char in long value:" + obj.l);// 97
		System.out.println("char in float value:" + obj.f2);// 97

		System.out.println("char in double value:" + obj.d2);// 97



		if (obj.bl) {
			System.out.println("boolean gng to execute if bl is true");
		}

	}

}
