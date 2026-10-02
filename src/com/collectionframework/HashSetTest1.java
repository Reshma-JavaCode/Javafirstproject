package com.collectionframework;

import java.util.HashSet;

public class HashSetTest1 {

	//Hashset internally works based on the hashmap
	//capacity=16, load factor=0.75, Threshold=12(for 12 elements capacity=16)
	
	public static void main(String[] args) {

		HashSet<Integer> s=new HashSet<>();
		
		s.add(10);//10%16=10 ----> map.put(10,new Object());
		s.add(20);//20%16=4
		s.add(30);//30%16=14
		s.add(40);//40%16=8
		s.add(50);//50%16=2
		
		System.out.println(s); //[50, 20, 40, 10, 30]
	}

}
