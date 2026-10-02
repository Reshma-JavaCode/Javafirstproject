package com.collectionframework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest1 {

	public static void main(String[] args) {

		NavigableSet<Integer> s=new TreeSet<>();
		// or TreeSet<Integer> s=new TreeSet<>();
		
		s.add(60);
		s.add(50);
		s.add(90);
		s.add(20);
		s.add(50);
		
		System.out.println(s);// [20, 50, 60, 90]
		
		System.out.println(s.floor(55)); //50
		System.out.println(s.ceiling(55)); //60
		System.out.println(s.lower(50));//20
		System.out.println(s.higher(50));//60
	}

}
