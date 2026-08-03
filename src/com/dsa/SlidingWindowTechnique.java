package com.dsa;

import java.util.Scanner;

public class SlidingWindowTechnique {

	public static void main(String[] args) {

		//day 1 - 50 users visited the website
		//day 2- 30 users visited...
		//day 6- 100 users visited
		int users[]= {50,30,60,70,50,100};
		int windowSum=0, avg=0;
		System.out.println("Enter how many days data do you want??:");
		Scanner sc=new Scanner(System.in);
		int days= sc.nextInt();
		
		for(int i=0;i<days;i++)
		{
			windowSum += users[i];
		}
		avg= windowSum/days;
		System.out.println("First "+days+" days visited users count= "+windowSum);
		System.out.println("Avg= "+avg);
		
		for(int i=1;i<=users.length-days;i++)
		{
			windowSum= windowSum- users[i-1]+ users[i+days-1];
			avg= windowSum/days;
			System.out.println("next "+days + " days visited users count= "+windowSum);
			System.out.println("Avg= "+avg);

		}
		
		sc.close();
	}

}
