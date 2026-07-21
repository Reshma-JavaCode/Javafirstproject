package com.practice;

public class SAMain {

	public static void main(String[] args) {

		Address a=new Address("Hyd","Telangana");
		Student s=new Student(101,"Reshma",a);
		
		System.out.println("=======Student Details======");
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.a.city);
		System.out.println(s.a.state);
	}

}
