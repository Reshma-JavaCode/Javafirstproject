package com.languagefundamentals;

public class WrapperCache {

	public static void main(String[] args) {
		//cache range for integers are -127 to 128
		Integer a=127,b=127;
		System.out.println(a==b);
		Integer c=300,d=300;
		System.out.println(c==d);
		Integer e=-128,f=-128;
		System.out.println(e==f);
		
	}

}
