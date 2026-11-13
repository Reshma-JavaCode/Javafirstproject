package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Nested Object Array problem in Java. We can solve it using recursion + ArrayList.
//reversing the given array and
//display reverse values in same  nested array structure
public class NestedArray_ReversingAndNesting {

static List<Integer> l=new ArrayList<>();
	
// Step 1: Collect all integer values
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
	
	static int index=0;
	 // Step 2: Replace integer values in reverse order
	static void reverse(Object[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i] instanceof Integer)
				a[i]= l.get(index--);//a[0]=70
			
			else if(a[i] instanceof Object)//70
				reverse((Object[])a[i]);//reverse([60,70])
		}
	}
	public static void main(String[] args) {

		 Object[] arr = {
		            10,
		            new Object[]{90, 30},
		            40,
		            new Object[]{50, new Object[]{60, 70}}
		        };
		 
		
		 collectIntValues(arr);
		 
		 System.out.println("After Collection values as Integer: ");
		 System.out.println("Before Sorting: "+l);
		 
		index= l.size()-1;
		reverse(arr);
		
		System.out.println(Arrays.deepToString(arr));
	}

}
