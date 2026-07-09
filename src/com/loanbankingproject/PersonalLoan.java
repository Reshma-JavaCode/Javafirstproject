package com.loanbankingproject;

public class PersonalLoan extends LoanImp {

	public static void main(String[] args) {

		System.out.println("**** Welcome to RMR Bank for Personal Loan ***");

		PersonalLoan l = new PersonalLoan();

		if (l.validateCustomer()) {

			Customer customer = l.getCustomerDetails();

			if ((customer.getAge() > 20 && customer.getAge() <= 60) && (customer.getSalary() >= 50000)
					&& (customer.getCibilScore() > 300 && customer.getCibilScore() <= 900)) {
				System.out.println("Congratulations, You are Eligible for loan");

				double interest = l.getRateOfInterest();

				if (customer.getCibilScore() < 600)// 300-600
				{
					interest = interest + 3.5;
				} else if (customer.getCibilScore() < 700)// 600 -700
				{
					interest = interest + 2.5;
				} else if (customer.getCibilScore() < 750)// 700-750
				{
					interest = interest + 1.5;
				} else// 750-900
				{
					interest = interest - 1.0;
				}

				System.out.println("Rate Of Interest is: " + interest);

				System.out.println("Please Enter your Address: ");
				Address address = l.getCustomerAddress();
				customer.setAddress(address);

				System.out.println("\n========== CUSTOMER DETAILS ==========");

				System.out.println("Monthly Salary : " + customer.getSalary());
				System.out.println("Age: " + customer.getAge());
				System.out.println("CIBIL Score: " + customer.getCibilScore());

				System.out.println("\n----------- ADDRESS -----------");

				Address customerAddress = customer.getAddress();

				System.out.println("Plot No  : " + customerAddress.getPlotNo());
				System.out.println("Street   : " + customerAddress.getStreet());
				System.out.println("City     : " + customerAddress.getCity());
				System.out.println("District : " + customerAddress.getDistrict());
				System.out.println("State    : " + customerAddress.getState());
				System.out.println("Country  : " + customerAddress.getCountry());
				System.out.println("Pincode  : " + customerAddress.getPincode());

				System.out.println("======================================");
			}

			else {
				System.out.println("Sorry, You are not eligible for the loan!!");
			}

		}

		else {
			System.out.println("Error occured in your personal information!!!");
		}

	}

}
