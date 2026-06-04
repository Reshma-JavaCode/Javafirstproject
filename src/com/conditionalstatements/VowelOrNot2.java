package com.conditionalstatements;

import java.util.Scanner;

public class VowelOrNot2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);

		c = Character.toLowerCase(c);

		switch (c) {
		    case 'a', 'e', 'i', 'o', 'u' ->
		        System.out.println(c+" is Vowel");
		    default ->
		        System.out.println(c +" is Not a vowel");
		}
	}

}
