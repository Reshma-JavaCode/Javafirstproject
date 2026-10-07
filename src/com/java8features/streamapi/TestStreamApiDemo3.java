package com.java8features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamApiDemo3 {

	public static void main(String[] args) {

		List<Integer> l1=Arrays.asList(100,21,21,22,33,44,45);
		
		System.out.println(l1);//[100, 21, 21, 22, 33, 44, 45]
		
		List<Integer> l2= l1.stream().map((i)->i*10).sorted().collect(Collectors.toList());
		
		System.out.println(l2);//[210, 210, 220, 330, 440, 450, 1000]
		
		List<Integer> l3= l1.stream().map((i)->i*10).sorted().distinct().collect(Collectors.toList());
		
		System.out.println(l3);//[210, 220, 330, 440, 450, 1000]
		
		//Flatmap
		List<List<Integer>> l4=Arrays.asList(Arrays.asList(10,20),Arrays.asList(30,40));
		List<Integer> l5=l4.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(l5);
	}

}
