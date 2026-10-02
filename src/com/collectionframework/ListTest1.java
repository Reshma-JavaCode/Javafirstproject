package com.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {

	public static void main(String[] args) {

		List<Integer> l1=new ArrayList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		l1.add(null);
		l1.add(null);
		
		System.out.println(l1);//[10, 20, 30, 10, null, null]
		
		System.out.println("\nex2");
		List<Integer> l2=new ArrayList<>();
		
		l2.add(10);
		l2.add(20);
		l2.add(30);//10 20 30
		l2.add(0,70);//70 10 20 30
		l2.add(1,80);//70 80 10 20 30
		l2.add(2,100);//70 80 100 10 20 30
		l2.add(10);//70 80 100 10 20 30 10
		l2.add(null);
		l2.add(null);
		System.out.println(l2);//[70, 80, 100, 10, 20, 30, 10, null, null]
		
		System.out.println("\nex3");
		List<Integer> l3=new ArrayList<>();
		
		l3.add(10);
		l3.add(20);
		l3.add(30);//10 20 30
		l3.add(0,70);//70 10 20 30
		l3.add(1,80);//70 80 10 20 30
		l3.add(2,100);//70 80 100 10 20 30
		l3.add(10);//70 80 100 10 20 30 10 :6 index completed(not have 7,8,9 indeces)
		//l3.add(101,10);//so,here it throws exception : java.lang.IndexOutOfBoundsException
		l3.add(null);
		l3.add(null);
		System.out.println(l3);//[70, 80, 100, 10, 20, 30, 10, null, null]
		
		System.out.println("\nex4");
		List<Integer> l4=new ArrayList<>();
		
		l4.add(1,10);//java.lang.IndexOutOfBoundsException since,at 0th index element not inserted
		l4.add(2,20);
		l4.add(30);//10 20 30
		l4.add(0,70);//70 10 20 30
		l4.add(null);
		l4.add(null);
		System.out.println(l4);//[70, 80, 100, 10, 20, 30, 10, null, null]
		
	
	
	}

}
