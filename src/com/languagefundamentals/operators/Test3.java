package com.languagefundamentals.operators;

public class Test3 {

	public static void main(String[] args) {

		int a1=5,b=5;
		int x,y,z,l;
		x=++a1;
		y=b++;
		z=--a1;
		l=a1--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(l);
		System.out.println(a1);
		System.out.println(b);
		
		int i=5,r;
		r= i++ + ++i + i--;
		System.out.println(r);
		
		int a=5;
		int r2= ++a + a++ + --a + a-- + ++a;
		System.out.println(r2);
		
		int p=2,q=4, s=3;
		int v= p++ * ++q - --s * p++ + ++q;
		System.out.println(v);
	}

}
