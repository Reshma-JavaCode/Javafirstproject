package com.conditionalstatements;

import java.util.Scanner;

public class TraditionSwitchCase2 {

	static String getWeekDay(int day)
	{
		String res="NTG";
		switch(day)
		{
		case 1: return "Sunday";
			
		case 2: return "Monday";
		
		case 3: return "Tuesday";
		
		case 4: return "Wednesday";
	
		case 5: return "Thursday";
		
		case 6: return "Friday";
	
		case 7: return "Saturday";
		
		default: return "Invalid day";
		}
		
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
