package com.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();

		students.add("Ravi");
		students.add("Rahul");

		Object[] arr = students.toArray();

		System.out.println(Arrays.toString(arr));
		
		//
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println(fruits);
	
		System.out.println("\nList to String array");
		String[] s= fruits.toArray(new String[0]);
		for(String i:s)
		{
			System.out.println(i);
		}

		System.out.println("\nInteger array conversion");
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l+"\n");// [10, 20, 30]
		
		Integer[] a=l.toArray(new Integer[l.size()]);
		System.out.println(Arrays.toString(a));
		
	}

}
