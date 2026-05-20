package com.languagefundamentals;

public class Hospital {

	static String hospital_name = "AKIRA";
	static int patient_id = 100;
	String patient_name;
	double treatment_cost;

	{
		patient_id++; //when class creates its val increament
	}

	double calculateBill(double d) {
		double tax = 25.00;

		return d + tax;
	}

	public static void main(String[] args) {

		Hospital h = new Hospital();
		h.patient_name = "Reshma";
		h.treatment_cost = 500.00D;
		double res1 = h.calculateBill(h.treatment_cost);
		System.out.println(hospital_name + " Patient Details");
		System.out.println("------------------------------------------");

		System.out.println("Patient ID: " + h.patient_id);
		System.out.println("Patient name: " + h.patient_name);
		System.out.println("treatment cost: " + h.treatment_cost);
		System.out.println("treatment total bill includin tax: " + res1 + "\n");

		Hospital h2 = new Hospital();
		h2.patient_name = "Vijaya";
		h2.treatment_cost = 1500.20D;
		System.out.println("Patient ID: " + h2.patient_id);
		System.out.println("Patient name: " + h2.patient_name);
		System.out.println("treatment cost: " + h2.treatment_cost);
		double res2 = h.calculateBill(h2.treatment_cost);
		System.out.println("treatment bill: " + res2 + "\n");

		Hospital h3 = new Hospital();
		h3.patient_name = "Bhargavi";
		h3.treatment_cost = 2000.80D;
		double res3 = h.calculateBill(h3.treatment_cost);
		System.out.println("Patient ID: " + h3.patient_id);
		System.out.println("Patient name: " + h3.patient_name);
		System.out.println("treatment cost: " + h3.treatment_cost);
		System.out.println("treatment bill: " + res3);
	}

}
