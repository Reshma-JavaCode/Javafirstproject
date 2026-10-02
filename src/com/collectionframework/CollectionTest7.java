package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest7 {

	public static void main(String[] args) {

		Collection<String> c1=new ArrayList<>();
		
		c1.add("Apple");
		c1.add("Banana");
		c1.add("Grapes");
		c1.add("Guva");
		
		System.out.println(c1);//[Apple, Banana, Grapes, Guva]
		
		//Sc-1: using for-each loop
		System.out.println("\nUsing for each loop");
		for(String s:c1)
		{
			System.out.println(s);
			//Apple
			//Banana
			//Grapes
			//Guva

		}
		
		//scenario-2: Using cursors with Iterator interface
		System.out.println("\nFetching data using iterator");
		//Iterator
		Iterator<String> i=c1.iterator();
		/*while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		while(i.hasNext())
		{
			if(i.next().equals("Banana"))
			{
				i.remove();
			}
		}
		
		System.out.println(c1);//[Apple, Grapes, Guva]
		
	}

}
