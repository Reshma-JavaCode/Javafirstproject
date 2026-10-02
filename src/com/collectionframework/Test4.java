package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {

		Collection<String> fruits=new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Citrus");
		fruits.add("Orange");
		fruits.add("Guava");
		
		System.out.println("Fetching Data:");
		System.out.println(fruits);
		
		System.out.println("\nUsing for-each loop to access data:");
		for(String f:fruits)
		{
			System.out.println(f);
		}
		
		System.out.println("\nUsing iterator method to access data:");
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
