package com.languagefundamentals.loops;

public class PrecidinOperators {
/*PUMA R ELA
	1. Parentheses () first
	2.Unary operators (++, --, !)
	3.Multiplication (* / % )
	3.Arithmetic (+ -)
	4.Relational (< > <= >=)
	5.Equality (== !=)
	6.Logical (&&, ||)
	7.Assignment (=)
	 */
	/*
		()
		Unary (++ -- !)
		* / %
		+ -
		Relational (< > <= >=)
		Equality (== !=)
		&&
		||
		?:
		=
	 */
	public static void main(String[] args) {
		System.out.println("Logical operators");
		System.out.println(true || false && false);
		/* 
		false && false → false
		true || false → true
		
		&& has higher precedence than ||.
		*/
		
		int x=5;
		int y=++x;//x increment then assign val to y
		System.out.println("Pre-Increment");
		System.out.println("x= "+x);//6
		System.out.println("y= "+y);//6
		
		int a=5;
		int b=a++;//b=5 then a value incremnets to 6
		System.out.println("Postincrement");
		System.out.println("a= "+a);//6
		System.out.println("b= "+b);//5
		
		System.out.println("Operation");
		int p = 5;
		int  q= 10;
		int r = p + q * 2 > 20 ? 1 : 0;
		/*
		 * q*2= 10*2=20
		 * p+20=5+20=25
		 * 25>20 true
		 * res r=1
		 */

		System.out.println(r);
	}

}
