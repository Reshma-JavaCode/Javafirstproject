package com.languagefundamentals.constructor;

class Bank {
	String name;
	Bank()
	{
		
	}
Bank(String name)
{
	
}
}
//CE:Implicit super constructor Bank() is undefined for default constructor. 
//Must define an explicit constructor
class SBI extends Bank{
	SBI()
	{
		System.out.println("SBI No args constrctr");
	}
	public static void main(String[] args)
	{
		SBI s=new SBI();//when we create obj then it call supe() but
		//super constructor had parameterized not no args then it guve CE
		//if we have para constrctr then 
		//if we want to create objct we need to create no args constructr
		
	}
}