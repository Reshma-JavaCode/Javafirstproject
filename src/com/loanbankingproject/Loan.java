package com.loanbankingproject;

public interface Loan {

	public Customer getCustomerDetails();
	
	public Address getCustomerAddress();
	
	public boolean isValidPhoneNum();
	public boolean isValidAadhaar();
	public boolean isValidPan();
	
	public boolean validateCustomer();
	
	public double getRateOfInterest();
	
	
	
}
