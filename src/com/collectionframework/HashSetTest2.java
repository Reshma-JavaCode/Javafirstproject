package com.collectionframework;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {

		HashSet<Integer> s=new HashSet<>();
		
		s.add(10);//10%16=10 ----> map.put(10,new Object());
		s.add(20);//20%16=4
		s.add(30);//30%16=14
		s.add(40);//40%16=8
		s.add(50);//50%16=2
		
		s.add(60);//60%16=12
		s.add(70);//70%16=6
		s.add(80);//80%16=0
		s.add(90);//90%16=10
		s.add(100);//100%16=4
		
		s.add(16);//16%16=0
		s.add(null);//0
		
		System.out.println(s);//[80, 16, null, 50, 20, 100, 70, 40, 10, 90, 60, 30]

	}

}
