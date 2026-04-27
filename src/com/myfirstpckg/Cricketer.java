package com.myfirstpckg;

public class Cricketer {
	//Instance variables stores in Heap area
	String cricketerName="reshu";
	int jersyNo=3;
	
	//static variables stores in method area
	static String countryName="India";
	static int countryID=91;
	
	
	
	public static void main(String[] args) {
		
    System.out.println("Country name:"+countryName);
    System.out.println("Country ID:"+countryID);
    
    //LHS=Class name with c as object reference variable
    //RHS=new keyword to 
    Cricketer c=new Cricketer();
    c.cricketerName="Dhoni";
    c.jersyNo=45;
    System.out.println("***********Object1**********");
    System.out.println("Country name:"+countryName);
    System.out.println("Country ID:"+countryID);
    
    System.out.println("Cricketer name:"+c.cricketerName);
    System.out.println("jersy num :"+c.jersyNo);
    
    Cricketer c1=new Cricketer();  
    c1.cricketerName="virat";
    c1.jersyNo=450;
    System.out.println("***********Object2**********");
    System.out.println("Country name:"+countryName);
    System.out.println("Country ID:"+countryID);
    
    System.out.println("Cricketer name:"+c1.cricketerName);
    System.out.println("jersy num :"+c1.jersyNo);
    
    Cricketer c2=new Cricketer();  
    //c2.cricketerName="Rohit";
    //c2.jersyNo=50;
    countryID=11;
    countryName="Bharath";
    System.out.println("***********Object3**********");
    System.out.println("Country name:"+countryName);
    System.out.println("Country ID:"+countryID);
    
    //instance data intia
    System.out.println("Cricketer name:"+c2.cricketerName);
    System.out.println("jersy num :"+c2.jersyNo);
   
	}
	
}
