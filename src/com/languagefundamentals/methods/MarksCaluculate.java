package com.languagefundamentals.methods;
import java.util.Scanner;

public class MarksCaluculate {
	
	static Scanner sc=new Scanner(System.in);
	static int java,html,sql;
	
	void display() {
		
		System.out.println("Enter java marks: ");
		java=sc.nextInt();
		System.out.println("Enter HTML marks: ");
		html=sc.nextInt();
		System.out.println("Enter SQL marks: ");
		sql=sc.nextInt();
		
		System.out.println("marks of three subjects are:");
		System.out.println("-----------------------------");
		System.out.println("marks of Java subjects is:"+java);
		System.out.println("marks of HTML subjects is:"+html);
		System.out.println("marks of SQL subjects is:"+sql);
		totalCalculate(java,html,sql);		
	}
	
	void totalCalculate(int m1,int m2,int m3)
	{
		int sum=m1+m2+m3;
		//System.out.println("\n");
		System.out.println("Total marks is: "+sum);
		average(sum);
	}
	
	void average(int sum1)
	{
		double avg=sum1/3;
		System.out.println("average of 3 subject is: "+avg +"\n");
	}
	
	
	public static void main(String[] args) {
		
		MarksCaluculate obj1=new MarksCaluculate();
		System.out.println("enter student1 marks:");
		obj1.display();
		
		MarksCaluculate obj2=new MarksCaluculate();
		System.out.println("enter student2 marks:");
		obj2.display();
		
		/*System.out.println("Enter java marks: ");
		java=sc.nextInt();
		System.out.println("Enter HTML marks: ");
		html=sc.nextInt();
		System.out.println("Enter SQL marks: ");
		sql=sc.nextInt();
		obj.display(java,html,sql);
		*/
		/*System.out.println("enter student2 marks:");
		System.out.println("Enter java marks: ");
		java=sc.nextInt();
		System.out.println("Enter HTML marks: ");
		html=sc.nextInt();
		System.out.println("Enter SQL marks: ");
		 sql=sc.nextInt();
		MarksCaluculate obj2=new MarksCaluculate();
		obj2.display(java,html,sql);
		*/
		
	}

}
