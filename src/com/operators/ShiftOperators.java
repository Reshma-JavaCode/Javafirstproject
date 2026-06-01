package com.operators;

public class ShiftOperators {

	public static void main(String[] args) {
		
		int a=76,b=2;
		System.out.println(a<<b);//n*2^k  76*2^2
		System.out.println(a>>b);//n/2^k  76/4=19
		
		//System.out.println(a<<5); //76*2^5= 76*32=232
		
		//System.out.println(a<<<b);//Syntax error on token "<", delete this token
		System.out.println(a>>>b);
		
		System.out.println(-76>>b);//signed return signed result -19
		System.out.println(-76>>>b);//unsigned returns large integer 1073741805
		
	}

}
