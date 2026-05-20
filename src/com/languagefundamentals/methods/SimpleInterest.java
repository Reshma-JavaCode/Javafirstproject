package com.languagefundamentals.methods;

import java.util.Scanner;

public class SimpleInterest {

	static double calculateSI(double p,double t,double r)
	{
		double s=(p*t*r)/100;
		return s;
	}
	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			double p,t,r;
			
			System.out.println("Enter principal amount");
			p=sc.nextDouble();
			System.out.println("Enter time amount");
			t=sc.nextDouble();
			System.out.println("Enter rate of interest");
			r=sc.nextDouble();
			
			double si=calculateSI(p,t,r);
			
			System.out.println("Simple Interest is: "+si);
			
	}

}
