package com.stringhandling;

public class VowelConsonantCount {

	public static void main(String[] args) {

		String s1="aee";
		boolean status=false;
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			s1=s1.toLowerCase();
			char ch=s1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{	
				count++;
				//System.out.println(s1+"Given String is in vowel");
			}
			if(count==s1.length())
			{
				status=true;
			break;
			}
		}
		if(status)
		{
			System.out.println(s1+"Given String is in vowel");
		}
		else
			System.out.println(s1+"Given String is not in vowel");
		
		
	}

}
