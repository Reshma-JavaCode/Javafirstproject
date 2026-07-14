package com.methodoverloading;

/*
1.Employee Salary Using Method Overloading
Problem Statement:
Write a Java program to calculate employee salary using method overloading.
Requirements:
1.Create a class named Employee.
2.Overload the method calculateSalary() as follows:
calculateSalary(salary)
calculateSalary(salary, bonus)
calculateSalary(salary,  bonus, allowance)
3.Display the total salary for each method call.
*/

public class Employee {
	
	void calculateSalary(double salary)
	{
		System.out.println("Employee Salary is: "+salary);
	}
	
	void calculateSalary(double salary,double bonus)
	{
		System.out.println("Employee Salary with bonus: "+(salary+bonus));
	}
	double calculateSalary(double salary, double bonus, double allowance)
	{
			return (salary+bonus+allowance);
	}
	
	
	//3.Display the total salary for each method call.


	public static void main(String[] args) {

		 Employee emp = new Employee();

	        emp.calculateSalary(30000);

	        emp.calculateSalary(30000, 5000);

	        System.out.println("Employee Salary with bonus and Allowance: "+emp.calculateSalary(30000, 5000, 2000));
	    	
	        
		
	}

}
