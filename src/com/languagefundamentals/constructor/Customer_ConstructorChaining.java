package com.languagefundamentals.constructor;

public class Customer_ConstructorChaining {

	int cid, age;
	String c_name;
	long phone;

	//No args constructor
	public Customer_ConstructorChaining() {
		this(300, 23); // calling 2 paramtr constructor
		System.out.println("No arg constrctr");
	}

	//2-parameter constructor
	public Customer_ConstructorChaining(int cid, int age) {
		this(cid, "Soni", 9999999999L); // calling 3-para constrctr
		System.out.println("2 parametr constrctr");
		// removing duplicate code this.cid,this.age
//		this.cid = cid;
//		this.age = age;
	}

	public Customer_ConstructorChaining(int cid, String c_name, long phone) {
		this(cid, 20, "Fouziya", phone);// calling 4 para constructor
		System.out.println("3-parametr constrctr");

		// avoiding repeating code
//		this.cid = cid;
//		this.c_name = c_name;
//		this.phone = phone;
	}

	public Customer_ConstructorChaining(int cid, int age, String c_name, long phone) {

		System.out.println("4-parameterized constrctr");
		// here at last called constructor we intialize here, this.cid initialization
		this.cid = cid;
		this.age = age;
		this.c_name = c_name;
		this.phone = phone;
	}

	public static void main(String[] args) {
		
		//c1 calls-> 2 para -> 3 para -> 4-para
		//stack here 4para execute the->3->2->no args
		Customer_ConstructorChaining c1 = new Customer_ConstructorChaining();
		c1.show();
//		Customer_ConstructorChaining c2=new Customer_ConstructorChaining(101, 23, "Reshu", 970187639L);
//		c2.show();
//		Customer_ConstructorChaining c3=new Customer_ConstructorChaining(102, "Pariha", 989898989L);
//		c3.show();

	}

	void show() {
		System.out.println("*****************************");
		System.out.println("Cid= " + cid);
		System.out.println("C age= " + age);
		System.out.println("C name= " + c_name);
		System.out.println("C phone= " + phone);
	}

}
