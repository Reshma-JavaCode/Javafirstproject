package com.deepcopy;


class Address
{
	String city;
	public Address(String city)
	{
		this.city= city;
	}
	
	public Address(Address a)
	{
		this.city=a.city;
	}
}


class Student{
	int id;
	String name;
	Address a;
	
	public Student(int id,String name,Address a)
	{
		this.id=id;
		this.name=name;
		this.a=a;
	}
	public Student(Student s)
	{
		this.id=s.id;
		this.name=s.name;
		this.a=new Address(s.a);
	}
}
public class StudentTest {

	public static void main(String[] args) {

		Address obj1=new Address("Hyd");
		Student s1=new Student(100,"Reshma",obj1);
		
		System.out.println("Student 1 details: ");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.a.city);
		
		System.out.println();
		Student s2=new Student(s1);
		
		s2.id=101;
		s2.name="Safiya";
		s2.a.city="HNK";
		System.out.println("After copying info:\n");
		System.out.println("Student 2 details: ");
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.a.city);
		
		System.out.println();
		System.out.println("Student 1 details: ");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.a.city);
	
	}

}
