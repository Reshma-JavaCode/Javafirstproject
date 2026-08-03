package com.stringhandling;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String s1="Programming";
		String s2="";
		
		/*for (int i = 0; i < s1.length(); i++) {
		String c=Character.toString(s1.charAt(i));	
			
			if(!s2.contains(c)) {
				s2= s2+c;
			}
			}*/
		
		for (int i = 0; i < s1.length(); i++) {
		char c=s1.charAt(i);	
		
		if(s2.indexOf(c)==-1) {
			s2= s2+c;
		}
		}
	
		System.out.println(s2);
		System.out.println();
		/*
		for(int i=0;i<s1.length();i++)
		{
			boolean status=false;
			for(int j=0;j<s2.length();j++)
			{
			if(s1.charAt(i)!=s2.charAt(j))
			{
			s2=s2+s1.charAt(i);
			}
				/*if(s1.charAt(i)==s2.charAt(j))
						{
						status=true;
						break;
						}
			}
			
			if(!status)
			{
				s2=s2+s1.charAt(i);
		
			}
		}
		System.out.println(s2);*/
	}

}
