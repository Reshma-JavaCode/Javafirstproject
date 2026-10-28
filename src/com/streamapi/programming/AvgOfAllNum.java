package com.streamapi.programming;

import java.util.Arrays;
import java.util.List;

//Task: Using Java 8 Stream API, find the average of all numbers.
public class AvgOfAllNum {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 30, 40, 50
			);
		
		double avg1=numbers.stream().mapToInt(i -> i).average().orElse(0.0)  ;
		System.out.println(avg1);
	}

}
