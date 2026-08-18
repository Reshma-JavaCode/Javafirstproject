package com.exceptionhandling;

public class InSufficientBalanceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InSufficientBalanceException(String msg)
	{
		super(msg);
	}
	
}
