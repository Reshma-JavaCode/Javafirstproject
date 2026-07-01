package com.oops.encapsulation;

public class Student {

	private int sid;
	private String name;
	private int age;
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		if(sid>0)
		{
		this.sid = sid;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0 && age<=120)
		{
		this.age = age;
		}
	}
	
	
	
}
