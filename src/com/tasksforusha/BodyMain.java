package com.tasksforusha;

import java.util.*;

public class BodyMain {

	public static void main(String[] args) {

		HumanBody humanBody = new HumanBody();
		Address address = new Address();

		humanBody.setGender("M");
		humanBody.setHands("2");
		humanBody.setLegs("2");
		humanBody.setName("AAaa");

		address.setHouse_num(11);
		address.setStreet("A");

		humanBody.setAddress(address);

		HumanBody humanBody1 = new HumanBody();
		Address address1 = new Address();

		address1.setHouse_num(12);
		address1.setStreet("B");
		humanBody1.setAddress(address1);

		humanBody1.setGender("F");
		humanBody1.setHands("2");
		humanBody1.setLegs("2");
		humanBody1.setName("BBbb");

		List<HumanBody> list = new ArrayList<>();
		list.add(humanBody);
		list.add(humanBody1);

		overall(list);
		System.out.println(overall(list));
	}

//  public static 	void		main			int				A	
	public static List<Address> overall (List<HumanBody> listOfHumanBody){
		List<Address> addresses = new ArrayList<>();
		
		for(HumanBody hb : listOfHumanBody) {
			addresses.add(hb.getAddress());
		}
		return addresses;
	}
	
}