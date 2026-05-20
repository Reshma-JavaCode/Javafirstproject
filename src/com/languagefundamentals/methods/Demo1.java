package com.languagefundamentals.methods;

import java.util.Scanner;

public class Demo1 {

	byte b1,b2;
	short s1,s2;
	Scanner sc=new Scanner(System.in);
	 void add()
	{
		//byte b3=b1+b2; CE:Type mismatch: cannot convert from int to byte
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.add();
	}

}
