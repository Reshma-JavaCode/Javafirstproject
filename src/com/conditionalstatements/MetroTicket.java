package com.conditionalstatements;
import java.util.Scanner;
public class MetroTicket {

	public static void main(String[] args) {
		
		int age;
		Scanner sc=new Scanner(System.in);
		
		String res="";
		do {
			System.out.println("Enter Passenger Age: ");
			age= sc.nextInt();
		if(age<=0 || age>100)
		{
			System.out.println("Invalid Age");
		}
		
		else if(age<5)
		{
			System.out.println("Free Ticket");
		}
		else if(age<=12)
		{
			System.out.println("Child Ticket and fare= RS."+20);
		}
		else if(age<=59) 
		{
			System.out.println("Regular Ticket and fare= RS."+50);
		}
		else 
		{
			System.out.println("Senior Citizen Ticket and fare= RS."+30);

		}
		
		System.out.println();
		System.out.println("Do You Want To continue Checking? (Y/N)");
		res= sc.next();
		}while(res.equalsIgnoreCase("Y"));
	}
	

}
