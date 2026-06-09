package com.languagefundamentals.loops;

public class NumberReverse {
//Reverse a number.
	public static void main(String[] args) {

		int n = 123, rev = 0, rem;
		for (int i = n; i > 0; i = i / 10)// 123 12 1
		{
			rem = i % 10;// 3 2 1
			rev = rev * 10 + rem;// 3 30+2 320+1= 321

		}
		System.out.println(rev);
	}

}
