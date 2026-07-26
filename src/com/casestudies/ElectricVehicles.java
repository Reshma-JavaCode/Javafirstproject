package com.casestudies;

public class ElectricVehicles extends Vehicle {

	@Override
	void parking()
	{
		super.parking();

        System.out.println("Vehicle Type : Electric Vehicle");
        System.out.println("Parking Slot : E1");
        System.out.println("EV parking area with charging facility assigned.");
        System.out.println("Charging point allocated.");
        System.out.println("Parking completed successfully.");

	}
	
}
