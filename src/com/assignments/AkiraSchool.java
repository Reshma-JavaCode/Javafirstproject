package com.assignments;

import java.util.Scanner;

public class AkiraSchool {

	static Scanner sc=new Scanner(System.in);
	
	void enterMarks(String stud)
	{
		System.out.println("Enter Maths marks");
		int m=sc.nextInt();
		System.out.println("Enter Science marks");
		int s1=sc.nextInt();
		System.out.println("Enter English marks");
		int e=sc.nextInt();
		System.out.println("Enter Social marks");
		int s2=sc.nextInt();
		System.out.println("Enter Telugu marks");
		int t=sc.nextInt();
		
		int total_marks=(m+s1+e+s2+t);
		double percentage=studentResult(total_marks);
		System.out.println("-----------------------------------------");
		System.out.println("Student name: "+stud);
		System.out.println("Total marks: "+total_marks);
		System.out.println("Percentage : "+percentage+"%");
		
		System.out.println("-----------------------------------------\n");
	}
	double studentResult(int total_marks)
	{
		
		double perc=(total_marks/500.0)*100;
		return perc;
	}
	
	public static void main(String[] args) {
		
		
		AkiraSchool obj1=new AkiraSchool();
		
		System.out.println("Enter number of students:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{	
		sc.nextLine();
		System.out.println("Enter Student name:");
		String student1=sc.nextLine();
		obj1.enterMarks(student1);
		}
		/*
		AkiraSchool obj2=new AkiraSchool();
		System.out.println("Enter Student name:");
		sc.nextLine();
		String student2=sc.nextLine();
		
		obj2.enterMarks(student2);
		
		
		*/
		
		
	}

}
