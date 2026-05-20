package com.assignments;

public class Test2 {
 int multiply(int a,int b) {
	 return a*b;
 }
 //method overloading
 void add(int a,int b)
 {
	 System.out.println("Int");
 }

 void add(double a,double b)
 {
	 System.out.println("Double");
 }
	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.multiply(2,3));//here only int values given so,Int output
		t.add(10,20);
	}

}
