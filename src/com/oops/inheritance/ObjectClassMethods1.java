package com.oops.inheritance;

class Emp
{
	
}
public class ObjectClassMethods1  implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {

//		Emp e1 = new Emp();
//		System.out.println(e1);
		
		//Emp e2= (Emp)e1.clone();
		
		ObjectClassMethods1 o= new ObjectClassMethods1();
		System.out.println(o);//new adrs
		
		ObjectClassMethods1 o2= (ObjectClassMethods1)o.clone();
		System.out.println(o2);//new adrs
		
		System.out.println(o.equals(o2));//false
		
		o=o2;//reasigning
		System.out.println(o.equals(o2));//true
		
		
		ObjectClassMethods1 o3= new ObjectClassMethods1();
		ObjectClassMethods1 o4= new ObjectClassMethods1();
		System.out.println(o3);
		System.out.println(o4);
		
		System.out.println("*****getClass()*******");
		String s="Reshu";
		//int age=10;
		Integer id=100;
		
		System.out.println(s.getClass());//class java.lang.String
		
		System.out.println(id.getClass());//class java.lang.Integer
		
		//System.out.println(age.getClass());//CE:Cannot invoke getClass() on the primitive type int
		
		
		
	}

}
