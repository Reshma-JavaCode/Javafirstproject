package com.abstraction;

public class PaymentTest {

	public static void main(String[] args) {

		Payment p;
		
		p=new UPI();
		p.pay(200.28);
		
		p=new Cash();
		p.pay(300);
		
		p=new CreditCard();
		p.pay(500);		
		
	}

}
