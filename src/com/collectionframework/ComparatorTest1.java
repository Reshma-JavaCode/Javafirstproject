package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobile
{
	int price;
	String brand;
	public Mobile(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", brand=" + brand + "]";
	}
	
}

public class ComparatorTest1 {

	public static void main(String[] args) {

		Mobile m1=new Mobile(15000,"Samsung");

		Mobile m2=new Mobile(10000,"Redmi");

		Mobile m3=new Mobile(12000,"Realme");

		Mobile m4=new Mobile(30000,"Iphone");
		
		List<Mobile> m=new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		
		//Create an anonymous class that implements Comparator<Mobile>, and create an object of that anonymous class.
	/*	Comparator<Mobile> c=new Comparator<Mobile>()
		{
			@Override
			public int compare(Mobile o1, Mobile o2) {
				/*if(o1.price>o2.price)
					return 1;
				else if(o1.price<o2.price)
						return -1;
				else
					return 0;*/
				//return o1.brand.compareTo(o2.brand);
				
		//	}
			
		//};
		
		Comparator<Mobile> c=(o1,o2)->{
			return o1.brand.compareTo(o2.brand);
			
	
	};
			
		Collections.sort(m,c);
		for(Mobile i:m)
		{
		System.out.println(i);
		}
		
		
	}

}
