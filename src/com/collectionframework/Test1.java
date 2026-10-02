package com.collectionframework;

import java.util.Collection;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		//Collection is a raw type. 
		//References to generic type Collection<E> should be parameterized
		//Warning:Collection c=new ArrayList();
		Collection<Object> c=new ArrayList<>();
		
		c.add(10);
		c.add(20);
		c.add(50);
		c.add(30);
		
		c.add("Apple");
		c.add("Banana");
		
		c.add(12.5);
		c.add(25.6f);
		c.add(98.9D);
		
		
		System.out.println(c);
		
		
	}

}
