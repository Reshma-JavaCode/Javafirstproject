package com.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

////WAP Java program to implement Serialization

//java.io.NotSerializableException:without implementing Serializable interface
//Serializable: empty interface

class Employee implements Serializable 
{
	//serialVersionUID: provides Unique version Id for Serializatn class
	private static final long serialVersionUID= 1L;
	
	String name="Reshma";
	
	//Java ignores pwd, because password was marked as transient.
	transient String pwd="Reshu@123";
	
	int age=23;
	long phone= 9999888000L;
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException {

		Employee obj= new Employee();
		
		FileOutputStream fos=new FileOutputStream("E:\\testFiles\\testJava.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		oos.close();
		fos.close();
		System.out.println("Student Object Serialized successfully");
		
	}

}
