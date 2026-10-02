package com.java8features.predefinedfunctionalinterfaces;

import java.util.function.Predicate;

// predicate is functional Interface 
//because, Predicate has one abstract method:
//so, we can implement it using a lambda:
// Predicate<T> represents a condition/test.
// It takes one input and returns boolean.
public class TestPredicateDemo1 {

	public static void main(String[] args) {

		Predicate<Integer> p1=(i)-> i*i>100;
		
		System.out.println(p1.test(10));//false
		System.out.println(p1.test(11));//true
		
		System.out.println("\nString length>5?");
		Predicate<String> p2=(s)-> s.length()>5;
		
		System.out.println(p2.test("Reshma"));//true
		
		System.out.println("\nMarks >= 75:?");
		int[] marks= {90,80,70,60,50};
		
		p1=(d)-> d>=75;
		
		for(int i:marks)
		{
			if(p1.test(i))
			{
				System.out.println(i);
			}
		}
	}

}
