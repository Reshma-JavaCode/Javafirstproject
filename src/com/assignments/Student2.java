package com.assignments;

//DEEP COPY
////A deep copy creates a new object and 
///also creates new copies of all referenced 
///(nested) objects.
///Deep copy → Two parent objects, separate nested objects
///parent objects s1,s2
///nested objects a1,a2
///s1->a1
///s2->a2
///s2 change not on s1 vice versa
public class Student2 {
	
	String name;
	Address2 adr;
	
	Student2(String name,Address2 adr)
	{
		this.name= name;
		this.adr=adr;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("City: "+adr.city);
		System.out.println();
	}
	
public static void main(String[] args) {
		
	Address2 a1= new Address2("Hyd");
	Student2 s1= new Student2("Reshma",a1);
	//s1.adr.city="www";
	
	//Deep copy
	//Address2 a2= new Address2("Delhi");
	Address2 a2= new Address2(s1.adr.city);	
	Student2 s2= new Student2(s1.name,a2);
	
	System.out.println("Before changing: ");
	s1.display();
	s2.display();
	
	System.out.println("after changing: ");
	s2.adr.city="HNK";
	s1.display();
	s2.display();
	
	}
	
}
