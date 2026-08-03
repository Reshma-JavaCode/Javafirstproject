package com.stringhandling;

import java.util.Scanner;

//java ---a
//abbccc= b c
public class DisplayDuplicateChars {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");//abbccc
		String s1=sc.nextLine();
		String s2=new String();
		
		for(int i=0;i<s1.length();i++)
		{
			char ch= s1.charAt(i);
			if( s1.indexOf(ch)!= s1.lastIndexOf(ch) && s2.indexOf(ch)==-1)
			{
				System.out.println(ch);//a
				s2= s2+ch;
			}
		}
		
		sc.close();
		
	}

}
