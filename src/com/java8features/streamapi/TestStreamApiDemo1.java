package com.java8features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//process the data elements to get only even data
//reduced code is: TestStreamApiDemo2 class
public class TestStreamApiDemo1 {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(21);
		l.add(30);
		l.add(45);
		
		System.out.println(l);
		
		//Stream: Interface
		//stream(): method
		Stream<Integer> st=l.stream();
		//filter() takes predicate as parameter
		// filter() returns Stream
		// collect() is a terminal operation and returns the collected result
		Stream<Integer> f=st.filter((i)->i%2==0);
		//collect(): to get result as list by using toList() method which is in Collectors class 
		//even numbered elements going to store in list l2
		List<Integer> l2=f.collect(Collectors.toList());
		
		System.out.println(l2);
		//filter() is intermediate operation in stream API Because it returns another Stream.
		//collector() is Terminal Operation in Stream API(returning some o/p here it is returning list)
	}

}
