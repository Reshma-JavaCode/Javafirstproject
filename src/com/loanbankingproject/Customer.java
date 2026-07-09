package com.loanbankingproject;

//Achieved Encapsulation 
public class Customer {

	private int age;
	private double salary;
	private int cibilScore;
	private Address address; // Has-A-Relation Achieved

	// Getters
	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	// Setters
	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
