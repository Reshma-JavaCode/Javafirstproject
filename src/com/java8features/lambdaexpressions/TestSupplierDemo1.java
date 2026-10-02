package com.java8features.lambdaexpressions;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplierDemo1 {

	public static void main(String[] args) {

		Supplier<String> s1=()->{
			
			String fname="Reshma", lname=" Md";
			String fullName= fname+lname;
			return fullName;
		};
		
		System.out.println(s1.get());// Reshma Md
		
		//java.sql.Date does not have a no-argument constructor.
		//java.util.Date has new Date(), which creates the current date/time.
		Supplier<Date> s2=()-> new Date();
		System.out.println(s2.get());// Fri Oct 02 18:35:33 IST 2026
	}

}
