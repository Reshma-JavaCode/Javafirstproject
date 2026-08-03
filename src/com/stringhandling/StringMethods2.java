package com.stringhandling;

import java.util.Scanner;

public class StringMethods2 {

	public static void main(String[] args) {

		String s1 = "Java Programming";
		String s2 = "Language1234";

		///replace(): replacing old char to new char
		System.out.println("Replace character a to @");
		System.out.println(s1.replace('a', '@'));
		// System.out.println(s1.replace('z','p'));//Java Programming , no z in string s1
		
		
		/// replace(): replacing old Substring to new substring
		System.out.println("Replace Substring java to python:");
		System.out.println(s1.replace("Java", "Python"));// Python Programming
		
		// Case-sensitive: J and j are different ...
		System.out.println(s1.replace("java", "Python")); // Java Programming

		// replace() doesn't works with regex
		System.out.println("Replace() checks exact word/text");
		System.out.println(s1.replace("\\D", "X"));// Java programming

		////replaceAll(): 
		System.out.println("******* replaceAll() **********");
		System.out.println("Replace all chars to X");
		System.out.println(s1.replaceAll("\\D", "X"));// XXXXXXXXXXXXXXXX
		System.out.println("Replace all numbers to X");
		System.out.println(s2.replaceAll("\\d", "X"));// LanguageXXXX
		//CE:System.out.println(s1.replaceAll('a', '@'));
		System.out.println("Replace substring also works");
		System.out.println(s1.replaceAll("Java", "Python"));

		String Aadhar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Aadhar number:");
		Aadhar = sc.next();// 1212312312312

		System.out.println("Re");
		System.out.println(s1.replaceAll(s2, Aadhar));
		System.out.println(Aadhar.replaceAll("\\d(?=\\d{3})", "X"));// XXXXXXXXXX312
		//A positive lookahead checks whether a pattern exists after the current position, without including it in the match.
		//(?=\d{3}) : "Are the next three characters digits?"
		sc.close();
	}

}
