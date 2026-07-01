package com.oops.inheritance;

public class Teacher extends Person {

	void teach()
	{
		System.out.println(">>Teacher teaches\n");
	}
	public static void main(String[] args) {
		
		Teacher t= new Teacher();
		
		t.eat();
		t.sleep();
		t.teach();
		

	}

}
