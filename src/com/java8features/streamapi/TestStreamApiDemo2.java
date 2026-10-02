package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamApiDemo2 {
	
	//process the data elements to get only even data
	public static void main(String[] args) {

		List<Integer> l1=Arrays.asList(10,21,22,33,44,45);
		
		System.out.println(l1);
		
		//method chaining: calling one method with another method
		List<Integer> l2= l1.stream().filter((i)->i%2==0).collect(Collectors.toList());
		
		System.out.println(l2);
		
	}

}
