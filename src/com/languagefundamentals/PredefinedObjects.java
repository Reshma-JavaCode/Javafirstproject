package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class PredefinedObjects {

	public static void main(String[] args) {
		//bigInteger doesn't have no arg constructor
		//we must pass args when we want to create BI
		//BigInteger bi=new BigInteger();compilatio error
		
		BigInteger b1=new BigInteger("123567890123");
		BigInteger b2=new BigInteger("123567890123");
		System.out.println("Addition of 2 Big integers is: "+b1.add(b2));
		System.out.println("subtraction of 2 Big integers is: "+b1.subtract(b2));
		System.out.println("multiplication of 2 Big integers is: "+b1.multiply(b2));
		System.out.println("division of 2 Big integers is: "+b1.divide(b2)+"\n");
		
		BigInteger res[]=b1.divideAndRemainder(b2);
		System.out.println("division of 2 Big integers with quotient & reminder is: "+res[0]+" "+res[1]);
		
		//System.out.println(" of 2 Big integers is: "+b1.hashCode());
		
		//Bigdecimal
		BigDecimal bd1=new BigDecimal("123456.1245");
		BigDecimal bd2=new BigDecimal("123456.1245");
		System.out.println("Addition of 2 Big integers is: "+bd1.add(bd2));
		System.out.println("subtraction of 2 Big integers is: "+bd1.subtract(bd2));
		System.out.println("multiplication of 2 Big integers is: "+bd1.multiply(bd2));
		System.out.println("Division of 2 Big Decimals is: "+bd1.divide(bd2,3,RoundingMode.HALF_UP) +"\n");
		//System.out.println(" of 2 Big integers is: "+bd1.toString());
		
		//String literals --> string constant pool(SCP)
		//-s1,s2 with same content then give same memory/address
		//s1/s2,s3 has different value so give diff memory
		
		String s1="Reshma";
		String s2="Reshma";
		String s3="Soni";
		System.out.println(s1==s2); //true:it checks address of objects
		System.out.println(s1==s3); //false:it checks address of objects
		System.out.println(s1.equals(s2)); //true: it  checks content of objects
		
		//string objects----> Heap Area
		//every new string creates new address
		//so,even though content/value same memory gng to different in heap
		//s4,s5 has diff address == is false
		//equals() checks content so,s4.euals(s5) is true
		String s4=new String("Bhargavi");
		String s5=new String("Bhargavi");
		String s6=new String("Reshma");
		System.out.println(s4==s5); //false  checks address of objects
		System.out.println(s4.equals(s5)); //true:it checks address of objects
		
	}

}
