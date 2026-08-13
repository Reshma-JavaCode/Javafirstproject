package com.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	int empId;
	String empName;
	int empSalary;
	
	Employee(int empId,String empName,int empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee name:");
		String name=sc.nextLine();
		System.out.println("Enter Employee salary:");
		int salary=sc.nextInt();
		
		Employee e=new Employee(id,name,salary);
		
//		File file = new File("E:\\Employee_Serialization");
//		System.out.println(file.exists());
//		System.out.println(file.isDirectory());
		
		FileOutputStream fo=new FileOutputStream("E:\\Employee_Serialization\\employee.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		oos.writeObject(e);
		oos.close();
		fo.close();

        System.out.println("Object serialized");
        sc.close();

	}

}
