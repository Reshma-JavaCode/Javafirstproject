package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Test5 {

	public static void main(String[] args) {

		Collection<String> fruits=new ArrayList<>();
		if(fruits.isEmpty())//if fruits empty
		{
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Mango");
		}
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		//String obj[]=fruits.toArray();//CE:Type mismatch: cannot convert from Object[] to String[]
		Object object[]=fruits.toArray();
		for(Object i:object)
		{
			System.out.println(i);
		}
		
		
	}

}
