package com.myfirstpckg;

 class A{
	B b;
}
class B{
	A a;
}

public class GarbaeCollection1 {
//	@Override
//	protected void finalize()
//	{
//		System.out.println("Finalize method loaded");
//
//	}
@Override
protected void finalize() throws Throwable {
	System.out.println("garbage collector called");
}
	/*
	*4 void method1()
	{
		System.out.println("method1 method started");

		GarbaeCollection1 g4 = new GarbaeCollection1();

	}
	*/
	
	public static void main(String[] args) {

		System.out.println("main method started");
		GarbaeCollection1 g1 = new GarbaeCollection1();
		GarbaeCollection1 g2 = new GarbaeCollection1();
		GarbaeCollection1 g3 = new GarbaeCollection1();

		/*
		 1* g1=null; System.gc(); System.out.println(g1);//@5ca881b5. if,g1=null null
		 * System.out.println(g2);//@24d46ca6 //@5ca881b5
		 * System.out.println(g3);//@4517d9a3 //@24d46ca6
		 * System.out.println("main method ended");
		 */
		/*
		 2* g1=g2; System.gc(); System.out.println(g1);//@5ca881b5
		 * System.out.println(g2);//@5ca881b5 System.out.println(g3); //@24d46ca6
		 * System.out.println("main method ended");
		 */
		/*
		3 * new GarbaeCollection1(); System.gc(); System.out.println(g1);//@5ca881b5
		 * System.out.println(g2);//@5ca881b5 System.out.println(g3); //@24d46ca6
		 * System.out.println("main method ended");
		 */

		/*
		4* g1.method1();
		System.gc();
		System.out.println(g1);// @5ca881b5
		System.out.println(g2);// @5ca881b5
		System.out.println(g3); // @24d46ca6
		System.out.println("main method ended");
		*/
		A obj1=new A();
		B obj2=new B();
		obj1.b=obj2;
		obj2.a=obj1;
		
		obj1=null;
		obj2=null;
		new A();
		System.gc();
		
//		System.out.println(obj1);// null
//		System.out.println(obj2);//null
		
		System.out.println(g1);// @5ca881b5
		System.out.println(g2);// @5ca881b5
		System.out.println(g3); // @24d46ca6
		System.out.println("main method ended");
		System.gc();  
	}

}
