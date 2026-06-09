package com.conditionalstatements;

import java.util.Scanner;

//***yield is used return the value from switch block
public class YieldSwitch {

	static String getWeekDay(int day) {
		String res = switch (day) {
		case 1 -> {
			//use yield keyword
			//**When we need multiple statements inside a case:
			System.out.println("Yield usage for case 1: ");
			yield "Sunday";
		}
		
		//If the case has only one expression, use -> directly:
		case 2 -> "Monday";
			
		case 3 -> {yield "Tuesday";}
		case 4 -> {yield "Wednesday";}
		case 5 ->{yield  "Thursday";}
		case 6 ->{yield "Friday";}
		case 7 ->{yield  "Saturday";}
		default ->{yield "Invalid day";}
		};
		return res;
	}

	public static void main(String[] args) {

		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Day: ");
		day = sc.nextInt();

		String res = getWeekDay(day);
		System.out.println(res);
	}

}
