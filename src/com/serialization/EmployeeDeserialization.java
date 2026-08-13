package com.serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis=new FileInputStream("E:\\Employee_Serialization\\employee.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee)ois.readObject();
		
		
		System.out.println("Employee Id: "+e.empId);
		System.out.println("Employee Name: "+e.empName);
		System.out.println("Employee Salary: "+e.empSalary);
		
		ois.close();
		fis.close();
		
		//OR
		/*try {
		    FileInputStream fis =
		        new FileInputStream("E:\\Employee_Serialization\\employee.ser");

		    ObjectInputStream ois =new ObjectInputStream(fis);

		    Employee e = (Employee) ois.readObject();

		    System.out.println("Employee Id: "+e.empId);
		    System.out.println("Employee Name: "+e.empName);
			System.out.println("Employee Salary: "+e.empSalary);
		
			ois.close();
		    fis.close();

		} catch (IOException e) {
		    System.out.println("Problem while reading the file");
		} catch (ClassNotFoundException e) {
		    System.out.println("Employee class not found");
		}*/
	}

}
