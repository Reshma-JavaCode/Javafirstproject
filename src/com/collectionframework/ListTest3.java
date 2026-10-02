package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest3 {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<>();
		l.add(6);
		l.add(9);
		l.add(10);
		
		System.out.println(l); //[6 , 9, 10]
		
		//l.remove(6); //java.lang.IndexOutOfBoundsException
	/*	l.remove(l.indexOf(6));
		System.out.println(l);  //[9, 10]
		
		l.remove(l.get(0));
		System.out.println(l); //[10]
		*/
		Iterator<Integer> it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("\nMirror image");
		ListIterator<Integer> li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("______________________");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
