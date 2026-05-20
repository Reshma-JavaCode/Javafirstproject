package com.languagefundamentals.constructor;

public class ParameterizedConst {

	//instance data
		int id;
		String name;
		//
		{
			display();
			System.out.println("instace1");
		}
		
		//Parameterized constructor
		ParameterizedConst(int id,String name)
		{
			//this=to involke current class level data
			this.id=id;
			this.name=name;
			System.out.println("Parameterized constructor called");
		}
		
	 void display()
	{
		
		{
			System.out.println("Instance block");
		}
		System.out.println(id+ " "+name+"\n");
	}
	public static void main(String[] args) {

		
		ParameterizedConst obj2=new ParameterizedConst(99,"Vijaya");
		obj2.display();//it give 0 null
		//since,we haven't access local variables directly,
		//local variables works inside method only
		//to acces that local data we need to initialized local variable data with the help of  class level variables
		
	}

}
