package com.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//// Q)find character frequency using Java 8 Stream API.
//input: programming
//output: {p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}

public class Java8FrequencyOfChars {

	public static void main(String[] args) {

		String s="programming";
		
		//s.chars()= intStrem, to store character value as ascii code.
		//ex: p= 112, r= a=97
		
		//mapToObj(): converts to objects.
		//here,mapToObj(c is integer 112->(char)c i.e p):  Convert integer values into Character objects
		//112=p 97=a like
		
		//Frequency of each char
		Map<Character,Long> m=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(m);
		
		//Finding Duplicates 
		Map<Character,Long> duplicates=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		duplicates.forEach((ch,count)->System.out.println(ch+" : "+count));
		
		
		
		int[] arr = {5, 2, 5, 3, 2, 5, 8};
		
		Map<Integer,Long> res= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(res);
		
	}

}
