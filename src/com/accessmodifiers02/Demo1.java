package com.accessmodifiers02;

import com.accessmodifiers01.PublicAM;

public class Demo1 {

	public static void main(String[] args) {

		//Class and constructor must be public
		//then we can access it outside of the package
		PublicAM p=new PublicAM();
		System.out.println("Id: "+p.id);
		System.out.println("Name: "+p.name);
		p.method();
		
		
		

	}

}
