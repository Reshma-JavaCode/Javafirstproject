package com.casestudies;

public class Car extends Vehicle{

	@Override
	void parking()
	{
		super.parking();

        System.out.println("Vehicle Type : Car");
        System.out.println("Parking Slot : A1");
        System.out.println("Four-wheeler parking area assigned.");
        System.out.println("Parking completed successfully.");
    }
	

}
