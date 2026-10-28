package com.practice;

public class Accenture1 {

	static void test(double a,String s)
	{
		String res= String.valueOf((long)a)+s;
		System.out.println(res);
	}
	static void test(double a,double b)
	{
		long res= (long)a+(long)b;
		System.out.println(String.valueOf(res));
	}
	static void test(String s,String d)
	{
		System.out.println(s+d);
	}
	public static void main(String[] args) {

		double a=10.1,b=90.9;
		String s1="hello",s2="Reshma";
		test(a,s1);
		test(a,b);
		test(s1,s2);
	}

}
