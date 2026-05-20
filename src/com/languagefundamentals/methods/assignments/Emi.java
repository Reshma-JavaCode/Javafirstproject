package com.languagefundamentals.methods.assignments;

import java.util.Scanner;

public class Emi {
	
	static Scanner sc=new Scanner(System.in);
	
	//EMI per month
	double calculateEmi(int amount,int months)
	{
		double emi=amount/months;
		return emi;
	}
	
	//interest 
	double calculateInterest(int amount,double ir)
	{
		double i=(amount*ir)/100;
		
		return i;
		
	}
	
	//total amount=loan amount+interest
	double calculateTotalAmount(int amount,double i)
	{
		double total_Amount=amount+i;
		return total_Amount;
	}
	
	//gst on loan amount
	double calculateGst(int amount,double gr)
	{
		double gst=(amount*gr)/100;
		return gst;
	}
	
	public static void main(String[] args) {
		
		Emi obj=new Emi();
		System.out.println("Enter Loan amount:");
		int amount=sc.nextInt();
		System.out.println("Enter months:");
		int months=sc.nextInt();
		
		double emi=obj.calculateEmi(amount,months);
		System.out.println("emi per month is: "+emi+"\n");
		
		System.out.println("enter interest rate:");
		double ir=sc.nextDouble();
		double intrest=obj.calculateInterest(amount,ir);
		System.out.println("interest on loan amount per month is: "+intrest+"\n");
		
		double t=obj.calculateTotalAmount(amount,intrest);
		System.out.println("total amount including interest: "+t+"\n");
		
		System.out.println("Enter gst: ");
		double gst_rate=sc.nextDouble();
		double gst=obj.calculateGst(amount,gst_rate);
		System.out.println("Gst on loan amount is : "+gst);
		System.out.println("Loan amount+gst = "+(gst+amount));
	}

}
