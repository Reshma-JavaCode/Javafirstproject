package com.collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class maxOccurenceCharacters {

	public static void main(String[] args) {

		Map<Character,Integer> m=new HashMap<>();
		String s="aabbbcccac";
		
		char[] c=s.toCharArray();
		
		for(char i:c)
		{
			if(m.containsKey(i))
			{
				m.put(i, m.get(i)+1);
			}
			else
			{
				m.put(i, 1);
			}
		}
		
		int maxVal=0;
		char maxChar=c[0];
		
		//Set<Entry<Character,Integer>> es= m.entrySet();
		for(Entry<Character,Integer> i:m.entrySet())
		{
			if(i.getValue()>maxVal)//a=3 3>0, c=4, 4>3
			{
				maxVal=i.getValue();//3, 4
				maxChar=i.getKey();//a, c
			}
		}
		
		System.out.println(maxVal);
		System.out.println(maxChar);
	}

}
