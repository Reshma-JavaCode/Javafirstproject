package com.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


////WAP Java program to implement De-Serialization

public class DeSerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("E:\\testFiles\\testJava.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e = (Employee) ois.readObject();//Typecasting

		// System.out.println(e.name+" "+e.pwd+" "+e.age+" "+e.phone);
		System.out.println("Employee name: " + e.name);
		System.out.println("employee password: " + e.pwd);
		System.out.println("Employee age: " + e.age);
		System.out.println("Employee phone: " + e.phone);

		ois.close();
		fis.close();
	}
}
