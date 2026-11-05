package com.streamapi.programming;

import java.util.Scanner;

//Write a java program for correct the pattrean: 
//input : ACEBD534FG12
//output : ABCDEFG12345

public class Lambda05 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to set the pattern: ");
		String x=sc.next();
		int a[]=new int[x.length()];
		String s1="",s2,s3;
		System.out.println(x.toLowerCase());
		
		for(int i=0;i<x.length();i++)
		{
			char ch= x.charAt(i);
			if(ch>=0 && ch<=9 )
			{
				a[i]=ch;
//				if(n1>ch)// 5 > 3
//				{
//					s1= ch+s1; //35
//					
//				}
//				else // 0 < 5, 3<4
//				{
//					s1= s1+ch;//5 354
//				}	
//				n1=ch;//5 3
			}
			
			else if(ch>='a' && ch<='z')
			{
				s1=s1+ch;
			}
		}
		
		
		
	}

}
