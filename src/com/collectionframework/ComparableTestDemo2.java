package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class House implements Comparator<House>
{
	double kitchen_width,livingroom;

	public House()
	{
		
	}
	public House(double kitchen_width, double livingroom) {
		super();
		this.kitchen_width = kitchen_width;
		this.livingroom = livingroom;
	}

	@Override
	public String toString() {
		return "House [kitchen_width=" + kitchen_width + ", livingroom=" + livingroom + "]";
	}

	@Override
	public int compare(House o1, House o2) {

		if(o1.kitchen_width>o2.kitchen_width)
			return 1;
		else if(o1.kitchen_width<o2.kitchen_width)
				return -1;
		else
		
		return 0;
	}
	
}

public class ComparableTestDemo2 {

	public static void main(String[] args) {
		
		House h1=new House(100, 120);
		House h2=new House(90, 300);
		House h3=new House(130, 150);
		Comparator<House> c=new House();
		List<House> l=new ArrayList<House>();
		l.add(h1);
		l.add(h2);
		l.add(h3);
		
		System.out.println(l);
		
		Collections.sort( l,c);
		System.out.println(l);
	}

}
