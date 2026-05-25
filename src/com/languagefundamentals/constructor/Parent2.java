package com.languagefundamentals.constructor;

public class Parent2 {
	static {
		System.out.println("parent static block");
	}
	{
		System.out.println("parent instance");
	}
	Parent2()
	{
		System.out.println("parent constructor");
	}
}
	class Child2 extends Parent2{
		static {
			System.out.println("child static block");
		}
		{
			System.out.println("child instance");
		}
		Child2()
		{
			//internally it calls super();
			//when parent loads then it checks instance data of parent
			//then it excutes parent constructor
			//then child instnace and child constructor executes
			System.out.println("child constructor");
		}
		public static void main(String[] args) {
			Child2 c=new Child2();
		}
	}

