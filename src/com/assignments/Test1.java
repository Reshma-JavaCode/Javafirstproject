package com.assignments;

public class Test1 {

		static {
			System.out.println("static block");
		}
		Test1(){
			System.out.println("Constructor");
		}
		{
			System.out.println("instance block");
		}
		
	public static void main(String[] args) {
		Test1 t=new Test1();
		Test1 t1=new Test1();
		Test1 t2=new Test1();
	}

}
