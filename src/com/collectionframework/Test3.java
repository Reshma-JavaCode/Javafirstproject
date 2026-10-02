package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {

		Collection<String> names=new ArrayList<>();
		
		names.add("Reshma");
		names.add("Pariha");
		names.add("Mehreen");
		
		for(String i:names)
		{
			System.out.println(i);
		}
		
		
	/*	for(int i=0;i<names.size();i++)
		{
			//CE:The method get(int) is undefined for the type Collection<String>
			System.out.println(names.get(i));
		}*/
		
		
		
		System.out.println("\nIterator to traverse the collection ");		
		Iterator<String> it=names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("\nArrayList with for loop:");		
		ArrayList<String> names2=new ArrayList<>();
		names2.add("Soni");
		names2.add("Fouziya");
		names2.add("Safiya");
		
		for(int i=0;i<names2.size();i++)
		{
			System.out.println(names2.get(i));
		}
		
		
		
	}

}
