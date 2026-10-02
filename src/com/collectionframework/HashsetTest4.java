package com.collectionframework;

import java.util.HashSet;
import java.util.Objects;

class Employee{
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(id,name);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)//e1.equals(e1)=true; or e1.equals(e2);
			return true;
		if(obj==null || getClass()!=obj.getClass())
			return false;
		
		Employee e=(Employee)obj;
			return id==e.id && name.equals(e.name);
	}
}


public class HashsetTest4 {

	public static void main(String[] args) {

		Employee e1=new Employee(101,"Reshma");
		Employee e2=new Employee(101,"Reshma");
		Employee e3=new Employee(102,"Reshma");
		
		HashSet<Employee> hs1=new HashSet<>();
		
		System.out.println(hs1.add(e1));
		
		System.out.println(hs1.add(e2));
		//calculate e2.hashCode() i.e equals to e1 since we overriden the hashcode
		//compare e2 with existing object using equals()
		//e1.equals(e2)
		//true
		//duplicate
		//do not add
		System.out.println(hs1.add(e3));
		
		System.out.println(hs1);
		//[Employee [id=101, name=Reshma]]
		
		System.out.println();
		System.out.println("Employee one info:\n"+e1);
		System.out.println("Employee one info:\n"+e2);
		
		//differenet hashcodes even though the data is same inside object
		//so,HashSet is not taking as duplicate info
		//Since, hashset works based on hashmap hashcodes
		System.out.println(e1.hashCode());//-1850567816
		System.out.println(e2.hashCode());//-1850567816
		System.out.println(e2.hashCode());//-1850567816
		
		//to make hashcodes equal : override it
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		/*
		 * add(object)->hashcode()->if matches hashcode->equals()->returns result 
		 * if equals=false else true
		 */
		
		
	}

}
