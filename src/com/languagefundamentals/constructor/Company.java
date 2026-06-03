package com.languagefundamentals.constructor;

//Super() and this keyword
class Employee {
    
    int empId;
    String empName;
    double salary;
    String department;

    // Parent constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

//    void displayEmployee() {
//        System.out.println("Employee Id : " + empId);
//        System.out.println("Employee Name : " + empName);
//        System.out.println("Salary : " + salary);
//    }
}

class Manager extends Employee {
    
    

    // Child constructor
    Manager(int empId, String empName, double salary, String department) {
        
        // calls parent constructor
        super(empId, empName, salary);

        this.department = department;
    }

    void displayManager() {
       // displayEmployee();
    	System.out.println("***************Employee Details***********");
    	System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    	System.out.println("Department : " + department);
    }
}

public class Company {
    
    public static void main(String[] args) {
        
        Manager m = new Manager(101, "Reshma", 50000, "Java Developer");

        m.displayManager();
    }
}

