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
	
	
	public String getCustomerAdrs()
	{
		System.out.println("enter Plot number: ");
		String plot= sc.next();
		System.out.println("enter your Street: ");
		sc.nextLine();
		String st=sc.nextLine();
		System.out.println("Enter your City name: ");
		String city= sc.next();
		System.out.println("enter District: ");
		String district= sc.next();
		System.out.println("Enter State: ");
		String state= sc.next();
		System.out.println("Enter Country: ");
		String country= sc.next();
		System.out.println("Enter your Pincode: ");
		String pincode= sc.next();
		boolean pin= pincode.matches("[0-9]{6}");
		String res=" ";
		if(pin)
		{
		res="plot NO: "+plot+" Street: "+st+" City: "+city
				+"District: "+district+" State: "+state+" Country: "+country+" Pincode: "+pincode;
		}else
		{
			System.out.println("Invalid pincode number");
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println("********Welcome to RMR Bank*******");
		PersonalLoan l=new PersonalLoan();
		
		boolean isPhoneValid= l.isValidPhoneNum();
		boolean isAadharValid= l.isValidAadhaar();
		boolean isPanValid= l.isValidPan();
		
			
		if((isPhoneValid) && (isAadharValid) && (isPanValid))
		{
			int age=l.getCustomerAge();
			double income=l.getCustomerSal();
			int cibilScore=l.getCibilScore();
		if((age>20 && age<=60) && (income>=50000) && (cibilScore>300 && cibilScore<=900) )
		{
			System.out.println("Congratulations, You are Eligible for loan");
			
			double interest= l.getRateOfInterest();
			
			if(cibilScore<600)//300-600
			{
				interest= interest + 3.5;
				//System.out.println("Rate Of Interest is: "+(interest+3.5));
			}
			else if(cibilScore<700)//600 -700
			{
				interest= interest + 2.5;
				//System.out.println("Rate Of Interest is: "+(interest+2.5));
			}
			else if(cibilScore<750)//700-750
			{
				interest= interest + 1.5;
				//System.out.println("Rate Of Interest is: "+(interest+1.5));
			}
			else//750-900
				{
				  	interest= interest - 1.0;
					//System.out.println("Rate Of Interest is: "+(interest-1.0));
				}
			System.out.println("Rate Of Interest is: "+interest);
			System.out.println("Please Enter your Adress: ");
			String Address= l.getCustomerAdrs();
			System.out.println("Your Adress Info: ");
			System.out.println(Address);
			
		}
		
		else
		{
			System.out.println("Sorry, You are not eligible for the loan!!");
		}
		
		}
		
		else
		{
			System.out.println("Error occured in your personal information!!!");
		}
		
	}

}
