package com.languagefundamentals.constructor;
//using this(): calling constructor inside another constructor 
public class Emp {
	int id;
	String name;
	double sal;
	Emp()
	{
		this(101);
		System.out.println("No args Constructor");
	}
	public Emp(int id, String name, double sal) {
		System.out.println("3 parameterized constructor");

		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public Emp(String name, double sal) {
		this(101,"Reshma",500000);
		System.out.println("2 parameterized constructor");
	}
	public Emp(int id) {
		this("Reshma",500000);
		System.out.println("1 parameterized constructor");
	}
	public static void main(String[] args) {
		Emp e=new Emp();
		e.show();
	}
void show()
{
	System.out.println("Employee id: "+id);
	System.out.println("Employee name: "+name);
	System.out.println("Employee salary: "+sal);
	
}
}
