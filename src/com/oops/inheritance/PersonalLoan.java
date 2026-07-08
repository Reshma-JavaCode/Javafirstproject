package com.oops.inheritance;

import java.util.Scanner;

public class PersonalLoan {

	static Scanner sc=new Scanner(System.in);
	
	public int getCustomerAge()
	{
		System.out.println("enter Your Age:");
		int age=sc.nextInt();
		
		return age;
	}
	
	public double getCustomerSal()
	{
		System.out.println("Enter Your salary: ");
		double sal= sc.nextDouble();
		
		return sal;
	}
	
	public int getCibilScore()
	{
		System.out.println("Enter Your Cibil score:");
		int score= sc.nextInt();
		
		return score;
	}
	
	public double getRateOfInterest()
	{
		return 9.5;
	}

	public boolean isValidPhoneNum()
	{
		System.out.println("Enter your Phone number: ");
		String ph= sc.next();
		 
		boolean isValid= ph.matches("[6-9][0-9]{9}");
		
		return isValid;
	}
	
	public boolean isValidAadhaar()
	{
		System.out.println("Enter your Aadhaar number: ");
		String aadhar= sc.next();
		 
		boolean isValid= aadhar.matches("[0-9]{12}");
		
		return isValid;
	}
	
	
	public boolean isValidPan()
	{
		System.out.println("Enter your PanCard number: ");
		String pan= sc.next();
		 
		//PAN = 5 letters + 4 digits + 1 letter
		//if to accept lower as well as capital letters
		// boolean isValid = pan.matches("[A-Za-z]{5}[0-9]{4}[A-Za-z]");
		
		//but, pancard has all r capital letters only
		boolean isValid= pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
		
		return isValid;
	}
	
	public static void main(String[] args) {
		
		System.out.println("********Welcome to RMR Bank*******");
		PersonalLoan l=new PersonalLoan();
		
		int age=l.getCustomerAge();
		double income=l.getCustomerSal();
		int cibilScore=l.getCibilScore();
		boolean isPhoneValid= l.isValidPhoneNum();
		boolean isAadharValid= l.isValidAadhaar();
		boolean isPanValid= l.isValidPan();
		
		if((age>20 && age<=60) && (income>=50000) && (cibilScore>300 && cibilScore<=900) && (isPhoneValid) && (isAadharValid) && (isPanValid) )
		{
			System.out.println("Congratulations, You are Eligible for loan");
			
			double interest= l.getRateOfInterest();
			
			if(cibilScore<600)//300-600
			{
				System.out.println("Rate Of Interest is: "+(interest+3.5));
			}
			else if(cibilScore<700)//600 -700
			{
				System.out.println("Rate Of Interest is: "+(interest+2.5));
			}
			else if(cibilScore<750)//700-750
			{
				System.out.println("Rate Of Interest is: "+(interest+1.5));
			}
			else//750-900
				{
					System.out.println("Rate Of Interest is: "+(interest-1.0));
				}
		}
		
		else
		{
			System.out.println("Sorry, You are not eligible for the loan!!");
		}
		
	}

}
