package com.stringhandling;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s= sc.nextLine();
		int count=0;
		//int wordCount=1;
		
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)!=' ') && (i==0 || s.charAt(i-1)==' '))
			{
				count++;
			}
			
		}
		
		System.out.println("Words count= "+count);
		sc.close();
	}

}
