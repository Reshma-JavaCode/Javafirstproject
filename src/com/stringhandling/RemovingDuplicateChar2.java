package com.stringhandling;

import java.util.Scanner;

public class RemovingDuplicateChar2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");//jaava
		String s1=sc.nextLine();
		String s2=new String();
		
		for(int i=0;i<s1.length();i++)
		{
			char ch= s1.charAt(i);// j a a v a
			
			if(s2.indexOf(ch)==-1)
			{
				//System.out.println(ch);//
				s2= s2+ch;//j a v
			}
		}
		
		System.out.println("after deleting duplicate characters from a given string: \n"+s2);
		
		sc.close();
	}

}
