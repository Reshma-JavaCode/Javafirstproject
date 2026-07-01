package com.practice;

public class Test3 {

	int id;
	
	Test3()
	{
		id=100;
		System.out.println("No args");
	}
	public Test3(int id) {
		super();
		//this.id = id;
	}
	public static void main(String[] args) {

		Test3 t1= new Test3();
		t1.show();
		Test3 t= new Test3(101);
		t.show(); //0
		
		
		
	}

	void show()
	{
		System.out.println(id);
		}
}
