package com.stringhandling;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] w=s.split(" ");
		String l="";
		
		for(int i=0;i<w.length;i++)
		{
			if(w[i].length()>l.length())
			{
				l=w[i];
			}
		}
		

        System.out.println("Longest word: " + l);

        sc.close();
        StringBuilder sb = new StringBuilder("Java");            
        sb.append("8").insert(0, "Core ").delete(5, 7);           
        System.out.println(sb); 
        
        
        
      /*  String s1=new String("java");
        String s2=s1.intern();
        System.out.println(s1==s2);
        
        StringBuilder sb = new StringBuilder("Java");            
        sb.append("8").insert(0, "Core ").delete(5, 7);           
        System.out.println(sb); 
        
        String s = "abc";          
        s.replace('a', 'x');          
        System.out.println(s); */
		
		/*  String s1 = "Java";      
		  String s2 = "Ja" + "va";       
		  String s3 = "Ja";        
		  String s4 = s3 + "va";         
		  System.out.println(s1 == s2);        
		  System.out.println(s1 == s4); */
		  
		 /* String s = "A" + "B" + "C";       
		  System.out.println(s == "ABC"); */
		  
		  final int x = 10;       
		  final int y = 20;         
		  String s1 = "Java" + x + y;            
		  String s2 = "Java1020";            
		  System.out.println(s1 == s2); 
		  
		  /* StringBuilder sb = new StringBuilder(10,20);   //CE
		   System.out.println(sb); */
	}

}
