package com.practice;

public class Test9 {

	static void show(int i)
	{
		System.out.println(i*10);
	}
	
	
	static void show(char i)
	{
		System.out.println(i);
		//when Java performs an arithmetic operation like:
		//the char is automatically promoted to an int.
		System.out.println(i*10);
		System.out.println(i+10);
		System.out.println(i+"10");
		System.out.println("Sum:" +10+20);
	}
	
	public static void main(String[] args) {

//		int i=10;
//		System.out.println(i);
		 show(10);
		show('A');
		show('B');
		
		String s1=new String("Java");//scp,heap
		String s2="Java";//scp
		String s3="Java";
		
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1==s2);//false
		System.out.println(s3==s2);//true
		
		s1=s1.intern();
		System.out.println(s1==s2);//true
		
//		StringBuffer sb=new StringBuffer("Java");
//		StringBuffer rev=new StringBuffer();
//		for(int i=0;i<sb.length();i++)
//		{
//			char c=sb.charAt(i);
//			rev= c+rev;
//		}
		
		/*StringBuffer sb=new StringBuffer("Java");
		String rev=new String();
		for(int i=0;i<sb.length();i++)
		{
			char c=sb.charAt(i);
			rev= c+rev;
		}
		System.out.println(rev);*/
		
		StringBuffer sb = new StringBuffer("Java");

		StringBuilder rev = new StringBuilder();

		for (int i = sb.length() - 1; i >= 0; i--) {
		    rev.append(sb.charAt(i));
		}

		System.out.println(rev);
	}

}
