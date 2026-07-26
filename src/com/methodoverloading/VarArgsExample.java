package com.methodoverloading;

public class VarArgsExample {

	
	static int sum(int... numbers)
	{
		int total=0;
		for(int num:numbers)
		{
			total+= num;
		}
		return total;
	}
	public static void main(String... args)
	// or public static void main(String[] args)
	//var args replace arrays
	//but arrays does not replace varargs
	{

		System.out.println(sum()); //0
		System.out.println(sum(10)); //10
		System.out.println(sum(10,20)); //30
		System.out.println(sum(10,20,30));//60
		
		//CE: diff args type values we cant paas using varargs
		//System.out.println(sum(10,20.3));
		
	}

}
