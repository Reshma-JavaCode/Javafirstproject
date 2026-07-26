package com.stringhandling;

final class Employee
{
	private final int eid;
	private final String name;
	
	Employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	
	public int getId()
	{
		return eid;
	}
	public String getName()
	{
		return name;
	}
	
//	public void setId(int id)
//	{
//		this.eid=id;//CE: The final field Employee.eid cannot be assigned
//	}
}

public class ImmutableClass {

	public static void main(String[] args) {

		Employee e1=new Employee(100,"Reshma");
		 System.out.println(e1.getId());
	     System.out.println(e1.getName());

	        // emp.setName("Ravi"); // Not possible
		
		
	}

}
