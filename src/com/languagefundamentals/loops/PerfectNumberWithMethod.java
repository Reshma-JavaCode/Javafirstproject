package com.languagefundamentals.loops;

import java.util.Scanner;
//Find Given number is Perfect number or not using method with return type
//input:number
//output:boolean(true/false)
public class PerfectNumberWithMethod {
  boolean perfectNumber(int n)
  {
	  boolean status=false;
	  int sum=0;
	  for(int i=1;i<n;i++)
	  {
		  if(n%i==0)
		  {
			  sum= sum+i;
		  }
	  }
	  if(sum==n)
	  {
		  status=true;
	  }
	  
	  return status;
  }
	public static void main(String[] args) {

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n= sc.nextInt();
		PerfectNumberWithMethod obj= new PerfectNumberWithMethod();
		boolean status= obj.perfectNumber(n);
		
		if(status)
		{
			System.out.println(n+" is a perfect number");
		}
		else
			System.out.println(n+" is not a perfect number");
	}

}
