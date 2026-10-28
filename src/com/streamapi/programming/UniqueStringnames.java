package com.streamapi.programming;

import java.util.Arrays;
import java.util.List;
//Using Java 8 Stream API, find the number of unique strings.
public class UniqueStringnames {

	public static void main(String[] args) {

		List<String> names = Arrays.asList(
			    "Java", "Python", "Java", "Spring", "Python", "SQL"
			);
		
		long count=names.stream().distinct().count();
		System.out.println(count);
	}

}
