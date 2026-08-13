package com.problemstgg;

import java.util.Scanner;

public class Test1 {
//a server compresses its long string to save space.the compression rule is 
//	k[encodestring],where encode_string inside sqr brackets is repeated k times .
//	k is always a positive int,
//	write prgrm to decode the compresses server log.
//	
//	note:u can assume i/p string is always valid and contain no extra space
//	i/p:single string s represents encoded log
//	o/p:single string represent decoded log
//	
//	constraints:
//	1<=s.length<=30
//	S consists of lowercase english letters,digits and squarebracrts[].
//	
//	
//	s="3[a]2[bc]"
//	aaabcbc
//	s=""2[a3[c]]""
//			acccaccc
//			the inner string 3[c] becomes ccc.outer string then becomes 2[accc],which
//			evaluates to acccaccc
	public static void main(String[] args) {
		
		String s=new String();
		//input
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		s=sc.next(); //3[a]2[bc]
		
		String res=new String();
		//int index=0;
		
		if(s.length()>=1 && s.length()<=30)
		{
			for(int i=0;i<s.length();i++)
			{
			char ch=s.charAt(i);
			if(ch=='[')//1
			{
				char num=s.charAt(i-1);//3

				for(int j=1;j<=num;j++)//1 2 3
				{
					res=res+s.charAt(i+1);//aaa 
				}
			}
			}
		}
		System.out.println(res);
		
	}

}
