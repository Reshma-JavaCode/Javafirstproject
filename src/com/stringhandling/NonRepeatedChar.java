package com.stringhandling;

import java.util.Scanner;

public class NonRepeatedChar {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");//jaava
		String s1=sc.nextLine();
		
		for(int i=0;i<s1.length();i++)
		{
			char ch= s1.charAt(i);
			if( s1.indexOf(ch)== s1.lastIndexOf(ch))
			{
				System.out.println(ch);//a
				break;
			}
		}
		
	}

}
