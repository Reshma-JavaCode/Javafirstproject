package com.languagefundamentals.methods;

//creating user defined object i.e class Employee1
class Employee1
{
	int eid=101;
	String ename="Reshma";
	String designation="Java Developer";
}

//main utility class
public class FactoryMethod {

	//Factory method: a class which can return object is F.M
	//using Employee1 object DT as return type
	static Employee1 getEmpInfo()
	{
		Employee1 e=new Employee1();
		return e;
	}
	
	//using Employee1 object DT as args
	static void getInfo2(Employee1 e)
	{
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.designation);
		
	}
	
	public static void main(String[] args) {
		Employee1 emp=getEmpInfo();
		System.out.println("employee id: "+emp.eid);
		System.out.println("employee name: "+emp.ename);
		System.out.println("employee Designation: "+emp.designation);
		
		Employee1 e=new Employee1();
		getInfo2(e);
	}
	/*static Scanner sc=new Scanner(System.in);
	eid=sc.nextInt();
	
	//sc.nextLine();
	ename=sc.nextLine();
	designation=sc.nextLine();
	*/

/*void empDetails(int id,String name,String d)
{
	
}*/
}
