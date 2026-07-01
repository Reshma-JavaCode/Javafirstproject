package com.oops.encapsulation;

public class FullyEncapsulationEmployeeTest {

	public static void main(String[] args) {

		//No arg constructor
		FullyEncapsulationEmployee obj1= new FullyEncapsulationEmployee();		
		System.out.println(obj1);
		//output: com.oops.encapsulation.FullyEncapsulationEmployee@1dbd16a6
		
		//Para constructor
		//To get Total object data
		FullyEncapsulationEmployee obj2= new FullyEncapsulationEmployee(-101,"Reshma");
		System.out.println(obj2);
		
		//to modify or access single* data we go for
		//Setters and Getters
		obj2.setId(102);
		obj2.setName("Soni");
		
		System.out.println("Id= "+obj2.getId());
		System.out.println("Name= "+obj2.getName());
		
		//It returns the runtime class (actual class) of the object.
		System.out.println("class= "+obj2.getClass());
	}

}
