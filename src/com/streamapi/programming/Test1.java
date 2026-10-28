package com.streamapi.programming;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList(
			    "Java", "Python", "Java", "Spring", "Python", "SQL"
			);
		
		int count= names.stream().filter(n-> n.startsWith("J")).map(n->1).reduce(0, (sum,cv)->sum+cv);
		System.out.println(count);
		
		//or count() which returns long 
		long c= names.stream().filter(n-> n.startsWith("J")).count();
		System.out.println(c);
		
		
	}

}
