package com.assignments;

public class Test4 {
	void show(Test4 t) {
		System.out.println("Method called");
	}
	public static void main(String[] args) {
		Test4 t=new Test4();
		t.show(t);
	}

}
