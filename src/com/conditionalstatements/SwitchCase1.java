package com.conditionalstatements;
import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s;
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		
		
		do {
			System.out.println("Enter symbol to do operations like:(+,-,*,/,%)");
			String symbol= sc.next();
		switch(symbol)
		{
		case "+" :System.out.println("Addition of two numbers is: "+(a+b));
		     break;
		case "-" :System.out.println("Subtraction of two numbers is: "+(a-b));
	         break;
		case "*" :System.out.println("Multiplication of two numbers is: "+(a*b));
	         break;
		case "/" :System.out.println("Division of two numbers is: "+(a/b));
	         break;
		case "%" :System.out.println("Modulus of two numbers is: "+(a%b));
	         break;
	         
        default:System.out.println("Undefined Symbol"); 
		}
		System.out.println("Enter yes/No to continue: (Y/N)");
		s=sc.next();
		}while(s.equalsIgnoreCase("Y"));
	}

}
