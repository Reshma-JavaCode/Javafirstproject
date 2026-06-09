package com.conditionalstatements;

import java.util.Scanner;
//WAP to return week of the day using modern switch case
public class SwitchAsReturnType {

	static String getWeekDay(int day)
	{
		String res= switch(day)
				{
		case 1-> "Sunday";
		case 2-> "Monday";
		case 3-> "Tuesday";
		case 4-> "Wednesday";
		case 5-> "Thursday";
		case 6-> "Friday";
		case 7-> "Saturday";
		default-> "Invalid day";
				};//required since, switch(day){} act as expression here
				//like,var=value/expr; res=switch(){};
				return res;
	}
	public static void main(String[] args) {
		
		int day;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Day: ");
		day= sc.nextInt();
		
		String res= getWeekDay(day);
		System.out.println(res);
	}

}
