package com.java8features.predefinedfunctionalinterfaces;

import java.util.function.Function;

public class TestFunctionDemo1 {

	//Function<Input, Output>
		public static void main(String[] args) {

			Function<Integer,Integer> f1=(a)->a*a;
			
			System.out.println(f1.apply(10));//100
			
			Function<String,Integer> f2=(s)-> s.length();
			System.out.println(f2.apply("Java is simple"));//14
			
			Function<Integer,String> f3=(i)->Integer.toString(i);
			//Function<Integer,String> f3=(i)->String.valueOf(i);
			System.out.println(f3.apply(100));
			
		}
	
}
