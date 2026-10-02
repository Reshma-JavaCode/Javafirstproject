package com.collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {

		SortedSet<Integer> s=new TreeSet<>();
		// or TreeSet<Integer> s=new TreeSet<>();
		
		s.add(60);
		s.add(50);
		s.add(90);
		s.add(20);
		s.add(50);
		//s.add("lll"); //java.lang.ClassCastException
		//s.add(null);// java.lang.NullPointerException
		System.out.println(s);// [20, 50, 60, 90]
	}

}
