package com.languagefundamentals.methods;

public class FactoryMethod2 {

	public static void main(String[] args) {
		
		Employee1 e=new Employee1();
		//e.eid=100;
		
		System.out.println("sid= "+e.eid);
		System.out.println("employee name: "+e.ename);
		System.out.println("employee Designation: "+e.designation);
		
	}

}
