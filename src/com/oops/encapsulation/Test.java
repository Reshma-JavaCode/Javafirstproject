package com.oops.encapsulation;

 class Demo{
	public int id;
	private String name;
	
	public void setId(int id)
	{
		if(id>0)
		{
			this.id=id;
		}
	}
	
	public int getId()
	{
		return id;
	}
}

public class Test {

	public static void main(String[] args) {

		Demo d= new Demo();
		System.out.println(d.id);//since,it is public
		
		d.setId(-100);//setter has validations
		System.out.println(d.getId());//0 
		
		//but due to public variable
		//user can change the var data as -ve value
		//it provide -ve value data also as output
		//so, to overcome this by using private variable
		
		d.id= -101;
		System.out.println(d.getId());//-101
		System.out.println(d.id);//-101
		
		
		//Direct access is not possible
		//bcz, name is private
		//so,secured
		
		//d.name="reshma";//CE
		
		//but encapsulation provides restricted access 		
		//by using public getters and setters
	}
	

}
