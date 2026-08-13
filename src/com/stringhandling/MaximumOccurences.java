package com.stringhandling;

import java.util.Scanner;

public class MaximumOccurences {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");//abbccc
		String s=sc.nextLine();
		
		int res[]=new int[127];// 0-126--> by default all 0's
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);//a b b c c c
			res[ch]= res[ch]+1;	
			//res[a]==res[97]=res[97]+1==0+1=1,
			//res[98]=0+1=1 ,res[98]=1+1=2, 
			//res[c]==res[99]= 0+1=1 ,1+1=2,2+1=3
		}
		
		int max=-1;
		char maxChar=' ';
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(res[ch]>max)
			{
				max= res[ch];
				maxChar= ch;
			}
		}
		
		System.out.println("Maximum occured character is: "+maxChar);
		for(int i=0;i<s.length();i++)//maxChar indeces
		{
			if(maxChar==s.charAt(i))
				System.out.print(i+" ");
		}
		
		sc.close();
		
	}

}
