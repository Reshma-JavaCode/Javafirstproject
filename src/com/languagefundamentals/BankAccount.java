package com.languagefundamentals;

public class BankAccount {

	//static variables exists entire duration of the program
	static int acc_no = 100;
	// instance variables exists as long as the object exists.
	String name;
	long balance;

	// instance block
	{
		acc_no++;
	}

	// To display fields
	void display() {
		System.out.println("Account number is: " + acc_no);
		System.out.println("Holder name is: " + name);
		System.out.println("Account balance is: " + balance + "\n");
	}

	public static void main(String[] args) {

		// object created so,instance block going to call;acc_no++ 101
		BankAccount obj1 = new BankAccount();
		obj1.name = "Reshma";
		obj1.balance = 3500;
		obj1.display();

		// object created so,instance block going to call;acc_no++ 102
		BankAccount obj2 = new BankAccount();
		obj2.name = "Safiya";
		obj2.balance = 9000;
		obj2.display();

		// object created so,instance block going to call;acc_no++ 103
		BankAccount obj3 = new BankAccount();
		obj3.name = "Fouziya";
		obj3.balance = 9090;
		obj3.display();
	}

}
