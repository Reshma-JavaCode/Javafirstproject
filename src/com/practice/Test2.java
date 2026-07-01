package com.practice;

public class Test2 {
//
//	ASCII: 0 to 127 (128 characters)
//	Java char: 0 to 65,535 (\u0000 to \uFFFF)
//	Full Unicode: U+0000 to U+10FFFF
	
	public static void main(String[] args) {

		char c2='B';
		System.out.println(c2);
		
		char c=65;
		
		System.out.println(c);
		
		
		char c1=127;
		System.out.println(c1);
		
		char min = '\u0000';
		char max = '\uFFFF';

		System.out.println((int) min);
		System.out.println((int) max);
	}

}
