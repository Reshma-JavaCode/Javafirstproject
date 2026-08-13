package com.practice;

public class Test11 {

	public static void main(String[] args) {
		
		String s="aabbc";
		
		//To get not repeated unique element
		//i.e c from above string
		System.out.println("To get not repeated unique element from: "+s);
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(s.indexOf(c)==s.lastIndexOf(c))
			{
				System.out.print(c);//c //java=jv
			}
		}
		System.out.println();
		System.out.println("remove duplicate elements from: "+s);
		
		//remove duplicate elements 
		//abc
		String s2=new String();
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);//a
			if(s2.indexOf(c)==-1)//a -1
			{
				s2=s2+c;
			}
		}
		System.out.println(s2);//abc
		
		//to display duplicate elements
		//i.e, ab
		String s3=new String();
		//System.out.println();
		System.out.println("to display duplicate elements from: "+s);
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);//a
			//a=0 !=1 and s3[a]=not present so,a
			if(s.indexOf(c)!=s.lastIndexOf(c) && s3.indexOf(c)==-1)
			{
				s3=s3+c;//a
			}
		}
		System.out.println(s3);//ab
		
		//First occure non-duplicate element 
		//i.e J
		String s4="Java";
		System.out.println("First occure non-duplicate element from: "+s4);
		for(int i=0;i<s4.length();i++)
		{
			char c= s4.charAt(i);//J
			if(s4.indexOf(c)==s4.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
		}
		
	}

}
