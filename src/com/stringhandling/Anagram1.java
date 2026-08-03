package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		
		String s1=sc.next().toLowerCase();
		System.out.println("Enter 2nd string:");
		String s2=sc.next().toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		if(s1.length()==s2.length())
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2))
			{
				System.out.println("Anagram");
			}
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("Not Anagram");
	}

}
