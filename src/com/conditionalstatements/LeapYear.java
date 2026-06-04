package com.conditionalstatements;
import java.util.Scanner;
public class LeapYear {

	//WAP to find given year is leap or non leap year
	         
	         //*******Logic**********
	//for century years, divide it with 400
	//non century year , divide it with 4
	//used nested if else
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year= sc.nextInt();
		
		if(year%100 ==0) //means century year ex:1900,2000
		{
			if(year%400 ==0) //2000
			{
				System.out.println(year+" is a Leap year");
			}
			else //1900
			{
				System.out.println(year+" is a Non-Leap year");
			}
		}
		
		//checking non century years ex:2024,2025,2028
		else {
		if(year%4 ==0 ) //2024
		{
			System.out.println(year+" is a Leap year");
		}
		else //2025
			System.out.println(year+" is a Non-Leap year");
	}
	}

}
