package com.collectionframework;

import java.util.HashSet;

public class HashSetTest3 {

	public static void main(String[] args) {

		HashSet<Integer> s=new HashSet<>();
		
		s.add(10);//10%16=10  10%32=10----> map.put(10,new Object());
		s.add(20);//20%16=4   20%32=20
		s.add(30);//30%16=14  30%32=30
		s.add(40);//40%16=8    40%32=8
		s.add(50);//50%16=2   50%32=18
		
		s.add(60);//60%16=12   60%32=28
		s.add(70);//70%16=6		70%32=6
		s.add(80);//80%16=0		80%32=16
		s.add(90);//90%16=10		90%32=26
		s.add(100);//100%16=4		4
		
		s.add(16);//16%16=0 		16 
		s.add(null);//0			0
				
		System.out.println(s);//[80, 16, null, 50, 20, 100, 70, 40, 10, 90, 60, 30]

		//13th element so,capacity=16*2=32,threshold=24
		//so, all elements now has to check by %32 not by %16
		s.add(32);//32%32=0
		System.out.println(s);//[null, 32, 100, 70, 40, 10, 80, 16, 50, 20, 90, 60, 30]
		
	}

}
