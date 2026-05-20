package com.assignments;

public class Test3 {
	void a()
	{
		System.out.println("A");
	}
	void b()
	{
		a();
		System.out.println("B");
	}
	public static void main(String[] args) {
		new Test3().b();
	}

}
