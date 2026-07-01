package com.oops.encapsulation;

public class FullyEncapsulationEmployee {

	private int id;
	private String name;
	
	//no arg constructor
	public FullyEncapsulationEmployee() {
	
		System.out.println("No arg constructor");
		
	}

	//Parameterized constructor
	//if we want create empty obj is not possible with default constructor
	//since, parameterized constructor is there so,
	//we need to create no-arg constructor
	public FullyEncapsulationEmployee(int id, String name) {
		super();
		//this.id = id;
		//this.name = name;
		
		 setId(id);   // Reuse validation
		 setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>0) {
		this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	
		this.name = name;
		
	}
			
	//overriding toString()
	@Override
	public String toString()
	{
		return "Employee Info [ID= "+id+", Name= "+name+" ]";
	}
}
