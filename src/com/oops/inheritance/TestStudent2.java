package com.oops.inheritance;

//****************Shallow Copy****************

//Common data
class SchoolAdress{
	
	String schoolName;
	
	public SchoolAdress(String schoolName)
	{
		this.schoolName= schoolName;
	}
}

//student details
class Student2 implements Cloneable{
	
	int id;
	String name;
	
	SchoolAdress sa;
		
	public Student2(int id, String name, SchoolAdress sa) {
		
		super();
		this.id = id;
		this.name = name;
		this.sa = sa;
		
	}
	
	//overriding clone() from protected to public
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();//calling Object.clone() and return objct
		
	}
	
}

//Main entry class
public class TestStudent2 {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		SchoolAdress obj= new SchoolAdress("Akira School");
		
		Student2 s1= new Student2(101,"Pariha",obj);
		
		System.out.println("********Student obj1 Info**********\n");
		System.out.println("Id: "+s1.id);
		System.out.println("Name: "+s1.name);
		System.out.println("School name: "+s1.sa.schoolName);
		
		Student2 s2= (Student2)s1.clone();//Explicit Type-casting
		
		//Primitive data types are not affected in 
		//shallow copy because their values are copied directly,
		//Primitive types change independtly 
		//bcz,primitive variables store the actual value, not a reference.
		s2.id=102;
		
		//String objects are immutable.
		//Immutable means once a String object is created, 
		//its contents cannot be changed.
		//if we want to change s2.name then
		//s1,s2 both has different objct adress
		s2.name="Reshma";
		
		//student doesn't stores schoolName directly,
		//it stored  only schoolName reference variable	
		//it does not creates new copy for both s1,s2 objects
		//so, schoolName is commonly shared for s1 and s2
		s2.sa.schoolName= "Ekashila School";
		
		System.out.println("\n********Student obj2 Info**********\n");
		System.out.println("Id: "+s2.id);
		System.out.println("Name: "+s2.name);
		System.out.println("School name: "+s2.sa.schoolName);
	
		//after changing school name
		//Student1 info 
		System.out.println("\nAfter changing school name by using s2");
		System.out.println("********Student obj1 Info**********\n");
		System.out.println("Id: "+s1.id);
		System.out.println("Name: "+s1.name);
		System.out.println("School name: "+s1.sa.schoolName);
		
		//student2 info
		System.out.println("\n********Student obj2 Info**********\n");
		System.out.println("Id: "+s2.id);
		System.out.println("Name: "+s2.name);
		System.out.println("School name: "+s2.sa.schoolName);
			
	}
}
