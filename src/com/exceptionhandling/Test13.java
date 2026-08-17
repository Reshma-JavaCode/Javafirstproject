package com.exceptionhandling;

public class Test13 {

	public static void main(String[] args) {

		System.out.println("started");
		int[] a=new int[4];
		
		try {
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//at com.exceptionhandling.Test13.main(Test13.java:13)
		}
		catch(Exception e)
		{
			System.err.println("Array Index OutOf Bounds Exception");
			e.printStackTrace();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Ended");
	}

}
