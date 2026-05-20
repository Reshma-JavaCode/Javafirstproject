package com.assignments;

public class Test6 {
	
	//2 instance blocks : foollows order
	//when it gng to execute in this again objct created so,stackoverflow occurs
	//i.e java.lang.StackOverflowError
	{
		System.out.println("block1");
		new Test6();
	}
	{
		System.out.println("block2");
	}
	public static void main(String[] args) {
		new Test6();
	}

}
