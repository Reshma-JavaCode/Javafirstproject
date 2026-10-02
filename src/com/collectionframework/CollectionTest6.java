package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest6 {

	public static void main(String[] args) {

		Collection<Integer> c1=new ArrayList<>();
		System.out.println(c1); // []
		System.out.println(c1.hashCode());//1
		
		
		Collection<Integer> c2=new ArrayList<>();
		System.out.println(c2); // []
		System.out.println(c2.hashCode());//1
		
		System.out.println(c1.equals(c2));//true
		System.out.println("_______________________-");
		c1.add(10);
		System.out.println(c1.hashCode());//31*1+10=41
		c1.add(20);//31*41+20= 1271+20 = 1291
		System.out.println(c1.equals(c2));//false
		
		System.out.println("__________________________");
		c2.add(20);//31+20=51
		c2.add(10);// 31*51+10=1591
		System.out.println(c2.hashCode());//1591
		System.out.println(c1.equals(c2));//false
		
	}

}
