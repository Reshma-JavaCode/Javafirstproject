package com.accessmodifiers02;

import com.accessmodifiers01.ProtectedAM;

//Protected Access modifiers
//Extends mandatory i.e inheritance for protected is mandatory
public class ProtectedDemo2 extends ProtectedAM {
	
	public static void main(String[] args) {

		// Protected in another class
		// ProtectedAM p1= new ProtectedAM();//CE:Since, constructor is protected
		//we can't create object directly 
		//by using child obj we can call parent class data.
		ProtectedDemo2 p2 = new ProtectedDemo2();
		System.out.println("Id= " + p2.id);
		System.out.println("Name: " + p2.name);
		p2.method();

	}

}
