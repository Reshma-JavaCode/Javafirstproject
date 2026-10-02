package com.collectionframework;

import java.util.List;
import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {

		List<String> TeamA=new ArrayList<>();
		TeamA.add("Dhoni");
		TeamA.add("Sachin");
		TeamA.add("Gautam");
		TeamA.add("Vishwa");
		
		List<String> teamB=new ArrayList<>();
		teamB.add("Abcd");
		teamB.add("Pqr");
		
		List<String> teamC=new ArrayList<>();
		teamC.add("Reshma");
		teamC.add("Anu");
		
		List<String> teamD=new ArrayList<>();
		teamD.addAll(TeamA);
		teamD.addAll(teamB);
		teamD.addAll(1,teamC);//0t index:Dhoni then 1st index:Reshma,2nd=anu...
		
		System.out.println(teamD);
		//[Dhoni, Reshma, Anu, Sachin, Gautam, Vishwa, Abcd, Pqr]

		System.out.println();
		for(int i=0;i<teamD.size();i++)
		{
			System.out.println(teamD.get(i));
		}
		
		teamD.add("Sachin");
		System.out.println(teamD.indexOf("Sachin"));
		System.out.println(teamD.lastIndexOf("Sachin"));
		
		
		
	}

}
