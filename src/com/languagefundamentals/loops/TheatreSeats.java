package com.languagefundamentals.loops;

public class TheatreSeats {

	public static void main(String[] args) {
		int seatid=100;
		int count=0;
		
		for(int i=1;i<=seatid;i++)
		{
			if(i%2==0)
				System.out.println("Seat"+i+": Booked");
			else
			{
				count++;
				System.out.println("Seat"+i+": Available");
			}
		}
		System.out.println("Available seats are: "+count);
	}

}
