package com.languagefundamentals.operators;

import java.util.Scanner;

public class StudentMarksIfElseIfLadder {

	public static void main(String[] args) {

		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("****** Student Grades ********");
		System.out.println("");
		System.out.println("Enter Your Marks: ");
		marks = sc.nextInt();

		
		if (marks >= 90) {
		    System.out.println("Grade A");
		}
		else if (marks >= 75) {
		    System.out.println("Grade B");
		}
		else if (marks >= 60) {
		    System.out.println("Grade C");
		}
		else if (marks >= 35) {
		    System.out.println("Pass");
		}
		else {
		    System.out.println("Fail");
		}
	}

}
