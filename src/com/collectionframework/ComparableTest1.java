package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop>
{
	int price;
	String brand;
	
	public Laptop(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + "]";
	}

	@Override
	public int compareTo(Laptop o) {
		
		//ordering based on price
		/*if(this.price>o.price)
			return 1;
		else if(this.price<o.price)
				return -1;
		else
			return 0;*/
		// ordering based on brand name
		return this.brand.compareTo(o.brand);
	}
	
	
}

public class ComparableTest1 {

	public static void main(String[] args) {

		Laptop l1=new Laptop(40000,"Lenova");
		Laptop l2=new Laptop(35000,"Dell");
		Laptop l3=new Laptop(55000,"Intel");
		Laptop l4=new Laptop(30000,"Azure");
		
		List<Laptop> al=new ArrayList<>();
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		
		
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Laptop>)
		Collections.sort(al);
		for(Laptop i:al)
		{
		System.out.println(i);
		}
		
	}

}
