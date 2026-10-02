package com.java8features.lambdaexpressions;

//Functional Interface
interface In1
{
	void method1();
}

public class TestFunctionalInterfaceDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started");
		
		//Anonymous class
		/*In1 obj = new In1() {
		    @Override
		    public void method1() {
		        System.out.println("interface implementation");
		    }
		};
		obj.method1();
		*/
		//This is a lambda expression implementing the functional interface.
		/*
		 * In1 → functional interface
			obj → reference variable
			() → parameters of method1()
			-> → lambda operator
			{ ... } → implementation/body of method1()
		 */
		In1 obj=()->{System.out.println("interface implementation");};
		obj.method1();//calls the lambda implementation.
		
		System.out.println("main method ended");
	}

}
