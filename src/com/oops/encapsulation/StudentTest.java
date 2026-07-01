package com.oops.encapsulation;

public class StudentTest {

	public static void main(String[] args) {

		Student s= new Student();
		
		//CE: we can't access private var directly
		//System.out.println(s.sid);
		
		s.setSid(-101);//o/p 0 since, invalid data
		//validations written in setter method->sid>0 
		//in setters i.e security
		
		s.setName("Reshma");
		s.setAge(32);
		
		
		System.out.println("********Student info********");
		System.out.println("Id: "+s.getSid());
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
	}

}
