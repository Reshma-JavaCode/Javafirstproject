package com.casestudies;

import java.util.Scanner;

public class TestVehicle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==================================");
		System.out.println("   APARTMENT PARKING SYSTEM");
		System.out.println("==================================");
		System.out.println("Select Your Vehicle Type");
		System.out.println("1.Car\n2.Bike\n3.ElectriVehicles");
		System.out.print("Enter your choice: ");

		int vehicleType = sc.nextInt();

		Vehicle v;

		switch (vehicleType) {
		case 1 -> v = new Car();
		case 2 -> v = new Bike();
		case 3 -> v = new ElectricVehicles();
		default -> {
			System.out.println("Invaid Vehicle type!!!");
			sc.close();
			return;
		}
		}

		System.out.println();
		v.parking();

		System.out.println();
		System.out.println("Thank you for using the Apartment Parking System.");

		sc.close();
	}

}
