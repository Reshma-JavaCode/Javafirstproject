package com.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);		
		System.out.println(l+"\n");// [10, 20, 30]
		
		//set: update value
		l.set(1, 100);
		System.out.println(l);// [10, 100, 30]
		
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println(fruits);
		
		List<String> veg=new ArrayList<>();
		veg.add("Tomato");
		veg.add("Potato");
		veg.add("Banana");
		System.out.println(veg);
		
				
		System.out.println();
		fruits.retainAll(veg);
		System.out.println(fruits);//Banana
		System.out.println(veg);
		
	/*	veg.retainAll(fruits);
		System.out.println(fruits);
		System.out.println(veg);*/
		
		
		
	}

}
