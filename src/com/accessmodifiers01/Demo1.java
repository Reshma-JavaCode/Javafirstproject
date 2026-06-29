package com.accessmodifiers01;

public class Demo1 {

	public static void main(String[] args) {
		
		//calling Default data within pckg 
		DefaultClass d= new DefaultClass();
		System.out.println("Id: "+d.id);
		System.out.println("Name: "+d.name);
		d.defaultMethod();
		System.out.println();
		
		//Calling public data within pckg 
		PublicAM p=new PublicAM();
		System.out.println("Id: "+p.id);
		System.out.println("Name: "+p.name);
		p.method();
		System.out.println();
		
		//Calling Protected data within pckg 
		ProtectedAM p1= new ProtectedAM();
		System.out.println("Id= "+p1.id);
		System.out.println("Name: "+p1.name);
		p1.method();
		
	}

}
