package com.assignments;

public class Test5 {
	//instance block
	{
		Test5 t=new Test5();
	}
	public static void main(String[] args) {
		//when objecte created it checks for instance related data,
		//again in instance we have objct creation means again it call instance block ..infinity.
		//so,stack overflow error will get
		Test5 t=new Test5();
		//output:runtime error java.lang.StackOverflowError
	}

}
