package com.loanbankingproject;

import java.util.Scanner;

public class LoanImp implements Loan {

	Scanner sc = new Scanner(System.in);

	// Phone number validation
	public boolean isValidPhoneNum() {

		System.out.println("Enter your Phone number: ");
		String ph = sc.next();

		boolean isValid = ph.matches("[6-9][0-9]{9}");

		return isValid;
	}

	// Aadhar validation
	public boolean isValidAadhaar() {

		System.out.println("Enter your Aadhaar number: ");
		String aadhar = sc.next();

		boolean isValid = aadhar.matches("[0-9]{12}");

		return isValid;
	}

	// Pancard validation
	public boolean isValidPan() {
		System.out.println("Enter your PanCard number: ");
		String pan = sc.next();

		// PAN = 5 letters + 4 digits + 1 letter
		// if to accept lower as well as capital letters
		// boolean isValid = pan.matches("[A-Za-z]{5}[0-9]{4}[A-Za-z]");

		// but, pancard has all are in capital letters only

		boolean isValid = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");

		return isValid;
	}

	// whole validations checking true/false
	public boolean validateCustomer() {
		boolean isPhoneValid = isValidPhoneNum();
		boolean isAadharValid = isValidAadhaar();
		boolean isPanValid = isValidPan();

		return isPhoneValid && isAadharValid && isPanValid;
	}

	// Reading Customer Details
	public Customer getCustomerDetails() {

		Customer customer = new Customer();

		System.out.println("Enter Your Age:");
		customer.setAge(sc.nextInt());

		System.out.println("Enter Your Salary:");
		customer.setSalary(sc.nextDouble());

		System.out.println("Enter Your CIBIL Score:");
		customer.setCibilScore(sc.nextInt());

		return customer;
	}

	// Reading Customer Address
	public Address getCustomerAddress() {

		Address address = new Address();

		System.out.println("enter Plot number: ");
		address.setPlotNo(sc.next());

		System.out.println("enter your Street: ");
		sc.nextLine();
		address.setStreet(sc.nextLine());

		System.out.println("Enter your City name: ");
		address.setCity(sc.next());

		System.out.println("enter District: ");
		address.setDistrict(sc.next());

		System.out.println("Enter State: ");
		address.setState(sc.next());

		System.out.println("Enter Country: ");
		address.setCountry(sc.next());

		while (true) {
			System.out.println("Enter your Pincode: ");
			String pincode = sc.next();

			if (pincode.matches("[0-9]{6}")) {
				address.setPincode(pincode);
				break;
			} else {
				System.out.println("Invalid Pincode");
			}
		}

		return address;
	}

	// Rate of interest
	public double getRateOfInterest() {
		return 9.5;
	}

}
