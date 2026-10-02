package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {

	public static void main(String[] args) {

		Collection<Object> boys=new ArrayList<>();
		
		boys.add("Rahul");
		boys.add("Mashuk");
		boys.add("Rabbani");
		
		System.out.println(boys);
		
        Collection<Object> girls=new ArrayList<>();
		
		girls.add("Reshma");
		girls.add("Safiya");
		girls.add("Fouziya");
		
		System.out.println(girls);
		
		Collection<Object> students=new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
		
		System.out.println(students);
		
		//clear()
		System.out.println("\nclear method");
		boys.clear();
		System.out.println(boys);
		System.out.println(students);
		
		//contains()
		System.out.println("\ncontain method");
		System.out.println(girls.contains("Safiya"));//true
		System.out.println(girls.contains("safiya"));//false
		
		System.out.println("\ncontainAll method");
		System.out.println(students.containsAll(girls));//true
		System.out.println(students.containsAll(boys));//true, bcz ntg to ntg
		System.out.println();
		
		Collection<String> s=new ArrayList<>();
		s.add("Fouziya");
		s.add("Safiya");
		s.add("Reshma");
		s.add("Safiya");
		System.out.println(girls.containsAll(s));//true
		s.add("Anu");
		System.out.println(girls.containsAll(s));//false
		
		System.out.println("\nremove method");
		girls.add("Reshma");
		girls.remove("Reshma");//[Safiya, Fouziya, Reshma] removes only 1 matching element
		System.out.println(girls);
		System.out.println("\nremoveAll method");
		System.out.println(students);
		students.removeAll(s);
		System.out.println(students);
		System.out.println(girls);
		
		//it works only when we 
		//ArrayList<Object> students=new ArrayList<>();
		//List provides remove(int index).
		
		students.remove(1);
		System.out.println(	students);
		//for,Collection<Object> students=new ArrayList<>(); index not works
				//Collection has remove(Object), not remove(int).
				
				
	}

}
