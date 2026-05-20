package com.languagefundamentals.methods;

public class Car {

	void carDetails(String carName,String color,String brand,String model)
	{
		System.out.println("Car name: "+carName);
		System.out.println("Car color: "+color);
		System.out.println("Car brand: "+brand);
		System.out.println("Car model: "+model);
		
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.carDetails("Suzuki", "Blue", "Suzuki", "Swift");
		
	}

}
