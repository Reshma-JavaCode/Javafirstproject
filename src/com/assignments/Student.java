package com.assignments;

//Shallow Copy
//"2 objects referring to the same nested object."
//Two Student objects exist, but they share one Address object.
////DEF: A shallow copy creates a new object,
//but the referenced (nested) objects are shared 
//between the original(s1) and the copied object(s2).

//Changes made in any object either s1 or s2 
//gng to effect on both s1,s2 
//since both sharing same address objec a1.
public class Student {
	
		    String name;
		    Address address;

		    Student(String name, Address address) {
		        this.name = name;
		        this.address = address;
		    }

		    void display() {
		        System.out.println("Name : " + name);
		        System.out.println("City : " + address.city);
		        System.out.println("Pincode: "+address.pincode);
		        System.out.println();
		    }

		    public static void main(String[] args) {

		        // Original object
		        Address a1 = new Address("Hyderabad",506099);
		        Student s1 = new Student("Reshma", a1);
		        
		            // Shallow Copy
		        Student s2 = new Student(s1.name, s1.address);
		       // Student s2 = new Student(s1);
		        
		        //s1.address.city="www";
			    
		        System.out.println("Before Changing");
		        s1.display();
		        s2.display();

		        // Change city using copied object
		      //  s2.name="Soni";
		        s2.address.city = "Delhi";
		        s2.address.pincode=506001;

		        System.out.println("After Changing City");
		        s1.display();
		        s2.display();
		    }
		
	}


