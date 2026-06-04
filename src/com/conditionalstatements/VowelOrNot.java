package com.conditionalstatements;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);

		switch (c) {
		case 'A' , 'a' -> System.out.println(c + " is vowel");
		case 'E' , 'e' -> System.out.println(c + " is vowel");
		case 'I' , 'i' -> System.out.println(c + " is vowel");
		case 'O' , 'o' -> System.out.println(c + " is vowel");
		case 'U' , 'u' -> System.out.println(c + " is vowel");
		default-> System.out.println(c+" is not a vowel");
		}

	}

}
