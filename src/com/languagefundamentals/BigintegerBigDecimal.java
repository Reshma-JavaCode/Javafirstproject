package com.languagefundamentals;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class BigintegerBigDecimal {
	
	BigInteger b1=new BigInteger("123456");
	BigInteger b2=new BigInteger("123456");
	BigDecimal bd1=new BigDecimal("1245.1234988700000000");
	BigDecimal bd2=new BigDecimal("1245.1234");
	
	public static void main(String[] args) {
		BigintegerBigDecimal obj=new BigintegerBigDecimal();
		System.out.println("Big Integer operations");
		System.out.println("-------------------------------------");

		System.out.println("Addition of 2 large integers is: "+obj.b1.add(obj.b2));
		System.out.println("Subtraction of 2 large integers is: "+obj.b1.subtract(obj.b2));
		System.out.println("multiplication of 2 large integers is: "+obj.b1.multiply(obj.b2));
		System.out.println("division of 2 large integers  is: "+obj.b1.divide(obj.b2));
		System.out.println("modulo of 2 large integers is: "+obj.b1.mod(obj.b2)+"\n");
		
		System.out.println("Big decimal operations");
		System.out.println("-------------------------------------");
		//System.out.println("division of 2 large decimals is: "+obj.bd1.divide(obj.bd2 ,4,));
		
		//BigDecimal.ROUND_HALF_UP deprecated and it is replaced with RoundingMode.HALF_UP
		System.out.println("division of 2 large decimals is: "+obj.bd1.divide(obj.bd2 ,4,BigDecimal.ROUND_HALF_UP));
		System.out.println("division of 2 large decimals is: "+obj.bd1.divide(obj.bd2 ,4,RoundingMode.HALF_UP));
		
		
		System.out.println("modulo of 2 large decimals is: "+obj.bd1.remainder(obj.bd2 ));
		System.out.println("addition of 2 large decimals is: "+obj.bd1.add(obj.bd2 ));
		
		Integer i=10;
		System.out.println(i instanceof Number);
		

	}

}
