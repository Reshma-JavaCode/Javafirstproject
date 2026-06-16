package com.languagefundamentals.loops;

public class IncrementOP_Priority {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z = x++ + ++y;
		//x++=2 ++y=3+1=4 z=2+4=6
		//x=3 y=4 z=6

		System.out.println(z);//6
	}

}
