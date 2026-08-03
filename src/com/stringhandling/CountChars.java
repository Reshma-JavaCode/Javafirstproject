package com.stringhandling;

import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String s1=sc.nextLine().toLowerCase();
		
		int vCount=0;
		int cCount=0;
		int charCount=0;
		int dCount=0;
		int spCount=0;
		int miscellaneousCount=0;
		int wordCount=0;
		
		// \\s+: One or more white spaces.
		String[] s2=s1.trim().split("\\s+");
		for(String i:s2)
		{
			wordCount++;
			System.out.println(i);
		}
		
		for(int i=0;i<s1.length();i++)
		{
			
			char c= s1.charAt(i);
			if(c>='a'&& c<='z')
			{
				charCount++;
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					vCount++;
				}
				else
					cCount++;
			}
			else if(c>= '0' && c<='9')
			//else if(Character.isDigit(c))
			{
				dCount++;
			}
			else if(c==' ')
			//else if(Character.isSpaceChar(c))
			{
				spCount++;
			}
			else
				miscellaneousCount++;
		}
	
		System.out.println("Words count: "+wordCount);
		System.out.println("Characters count: "+charCount);
		System.out.println("Vowels count: "+vCount);
		System.out.println("Consonents Count: "+cCount);
		System.out.println("Digits count: "+dCount);
		System.out.println("Spaces count: "+spCount);
		System.out.println("Special characters count: "+miscellaneousCount);
		sc.close();
		
	}

}
