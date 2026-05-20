package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ObjectDataTypes {

	// Userdefined Object DT //Student
	class UserDefined {
		int rno = 101;
		String name = "Reshma";

	}

	// Pre-defined DT
	// 1.Wrapper Object DT
	Integer i = 100; // auto-boxing
	Float f = 21f;
	Double d = 32.9999998778D;
	int i2 = i; // auto-unboxing

	// 2.normal object DT
	String s = "VCubes";
	BigInteger bi = new BigInteger("9701876216");
	BigDecimal bd = new BigDecimal("9701876216.9876543");

	public static void main(String[] args) {

		ObjectDataTypes obj = new ObjectDataTypes();
		UserDefined u = obj.new UserDefined();

		System.out.println("User defined object DT data are:");
		System.out.println("--------------------------------------");
		System.out.println("Student Roll number is: " + u.rno);
		System.out.println("Student name  is: " + u.name + "\n");

		System.out.println("Integer wrapper value is: " + obj.i);
		System.out.println("float wrapper value is: " + obj.f);
		System.out.println("double wrapper value is: " + obj.d);
		System.out.println("auto-unboxing of integer value is: " + obj.i2);

		System.out.println("Biginteger value is: " + obj.bi);
		System.out.println("BigDecimal value is: " + obj.bd);

	}

}
