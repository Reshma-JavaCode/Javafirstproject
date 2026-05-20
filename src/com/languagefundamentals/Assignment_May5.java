package com.languagefundamentals;

public class Assignment_May5 {
	// instance variables
	byte b;
	short age;
	int roll_no;
	long phone_no;

	// instance method
	void show() {
		b = 100;
		age = 27;
		roll_no = 2508;
		phone_no = 9701876216L;
		
		System.out.println("byte value:" + b);
		System.out.println("short value age:" + age);
		System.out.println("integer value Roll number:" + roll_no);
		System.out.println("long value Phone number:" + phone_no);
	}

	public static void main(String[] args) {
		
		Assignment_May5 obj = new Assignment_May5();
		obj.show();

	}

}
