package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//// Q) Nested Object Array problem in Java to fing kth largest element from it.

public class NestedArray_KthLargestNumber {

	static List<Integer> l=new ArrayList<>();
	
	public static void collectIntValues(Object[] a)
	{
		for(Object i:a)
		{
			if(i instanceof Integer)//True: 10 is Integer, 40 Integer
			{
				l.add((Integer)i); //l=10  20,30  40  50 60,70
			}
			
			else if(i instanceof Object)//{20,30}
			{
				collectIntValues((Object[]) i);//{20,30} {50,{60,70}}-> 50, {60,70}
				// called method for object array {20,30}
				//then it gives l=10 there now 20,30 added 
			}
		}
		
	}
	
	public static void main(String[] args) {

		 Object[] arr = {
		            10,
		            new Object[]{90, 30},
		            40,
		            new Object[]{50, new Object[]{60, 70}}
		        };
		 
		 int k=2;
		
		 collectIntValues(arr);
		 
		 System.out.println("After Collection values as Integer: ");
		 System.out.println("Before Sorting: "+l);
		 
		 //sorting,converting integer to int then conv to array
		 int b[]=l.stream() .sorted().mapToInt(i->i.intValue()).toArray();
		 
		 /*
		  * stream() – converts the list into a stream.
			sorted() – sorts in ascending order.
			mapToInt() – converts Integer objects into primitive int.
			toArray() – converts the stream into int[].
			
			
		  */
			
		 System.out.println("After Sorting Array Values are: ");
		 System.out.println(Arrays.toString(b));
		 System.out.println(k+ "th Largest element is : ");
		 System.out.println(b[b.length-k]);
		 
		 /*
		  *    OR
			 int b[]=l.stream() .sorted(Comparator.reverseOrder()).mapToInt(i->i.intValue()).toArray();
		 		System.out.println(b[k-1]);
		 		
			 sorted(Comparator.reverseOrder())
		  */
		 
		 
		
		 
		 
	}

}
