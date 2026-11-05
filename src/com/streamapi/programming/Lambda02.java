package com.streamapi.programming;

//Create a functional interface Calculator.
//Take two integers and return their sum using lambda.

interface Calculator{
	int sum(int a,int b);
}

public class Lambda02 {

	public static void main(String[] args) {
		
		Calculator c= (a,b)-> {
			
			return a+b;
			};
			
			//or
			//Calculator c= (a,b)-> a+b;

			System.out.println(c.sum(10, 20));
	}

}
