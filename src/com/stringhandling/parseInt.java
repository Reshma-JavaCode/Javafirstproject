package com.stringhandling;

public class parseInt {

	public static void main(String[] args) {

		String s= "1233";
		System.out.println(s+10);
	//	System.out.println(s*10); //CE: The operator * is undefined for the argument type(s) String, int
		
		System.out.println("String literal...");
		int i= Integer.parseInt(s);
		System.out.println(i*10);
		System.out.println(i+10);
		//System.out.println();
		
		System.out.println("String ..");
		String s2=new String();
		System.out.println(s2);//new line
		
		System.out.println("String Buffer..");
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);//new line
		
		System.out.println("String Builder..");
		StringBuilder sb2=new StringBuilder();
		System.out.println(sb2);//new line
		
		System.out.println("String to double..");
		String s3="100";
		System.out.println(s3);
		double d=Double.parseDouble(s3);
		System.out.println(d*2);
		
		//StringBuffer sb3="Java is simple";//CE: Type mismatch: cannot convert from String to StringBuffer
		
		StringBuffer sb3=new StringBuffer("Java");
		System.out.println("String Buffer value: "+sb3);	
		sb3.append("Vcube");
		sb3.append("KPHB");
		System.out.println("String Buffer after appending: "+sb3);
		
		StringBuilder sb4=new StringBuilder("Java");
		System.out.println("String Buffer value:\n "+sb4);	
		sb4.append("Vcube");
		sb4.append("KPHB");
		System.out.println("String Buffer after appending:\n "+sb4);
		
		System.out.println("Main method ended");
	}

}
