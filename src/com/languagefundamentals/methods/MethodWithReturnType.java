package com.languagefundamentals.methods;
import java.util.Scanner;

public class MethodWithReturnType {
	
	void getStudentName(String name)
	{
		System.out.println("Student name is: "+name);
	}
	
	void getStudentId(int id)
	{
		System.out.println("Student id is: "+id);
	}
	
	void getStudentphone(long mbl)
	{
		System.out.println("Student mobile no. is: "+mbl);
	}
	
	void getStudentweight(float wt)
	{
		System.out.println("Student weight is: "+wt);
	}
	
	public static void main(String[] args) {
		
		MethodWithReturnType obj=new MethodWithReturnType();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student name: ");
		String sname=sc.nextLine();
		obj.getStudentName(sname);
		
		System.out.println("Enter Student ID: ");
		int sid=sc.nextInt();
		obj.getStudentId(sid);
		
		System.out.println("Enter Student Mobile: ");
		long smbl=sc.nextLong();
		obj.getStudentphone(smbl);
		
		System.out.println("Enter Student Weight: ");
		float swt=sc.nextFloat();
		obj.getStudentweight(swt);
	}

}
