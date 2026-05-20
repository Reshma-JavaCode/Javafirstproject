package com.languagefundamentals.methods;

public class MethoDemo1 {
	
	static void display()
	{
		System.out.println("static method with no return type and no args");
	}
	void show()
	{
		System.out.println("Instance method with no return type and no args");
	}
	public static void main(String[] args) {
		System.out.println("main method started...");
		MethoDemo1.display();
		MethoDemo1 m=new MethoDemo1();
		m.show();
	}

}
