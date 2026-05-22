package com.languagefundamentals.constructor;

public class Person {
		
		String name;
		int age;
		Person()
		{
			name="Unknown";
			age=18;
			System.out.println("No args");
		}
		Person(String name,int age)
		{
			//if i not initialize values then o/p will be
			//Parameterized cons
			//Name: null
			//Age: 0
			this.name=name;
			
			this.age=age;

			System.out.println("Parameterized cons");		
			
		}
	public static void main(String[] args) {
		Person p=new Person();
		p.show();
		Person p2=new Person("Reshu",23);
		p2.show();
		
	}
	void show()
	{
		System.out.println("Name: "+name);

		System.out.println("Age: "+age);
	}
}
