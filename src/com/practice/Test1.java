package com.practice;

public class Test1 {

	{
		System.out.println("instance block");
	}
	
	Test1()
	{
		System.out.println("No arg constructor");
	}
	
	static int id=100;
	
	static void method(int id)
	{
		//this.id=id; //CE: Cannot use this in a static context
	}
	
	public static void main(String[] args) {
		
		method(102);
		
				
		//System.out.println(new Test1());
		System.out.println(new Test1().toString());
		
		
		
		int a[]= {1,2,1,3,1};
		boolean visited;
		
		for(int i=0;i<a.length;i++)
		{
			visited=false;
			for(int j=i+1;j<a.length;j++)
			{
				//if(a[i])
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		}

//	instance block
//	No arg constructor
//	com.practice.Test1@2b2fa4f7

}
