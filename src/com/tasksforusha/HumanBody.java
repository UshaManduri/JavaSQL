package com.tasksforusha;

public class HumanBody {

	private String hands;
	private String legs;
	private String name;
	private String gender;
	private Address address; 

	@Override
	public String toString() {
		return "HumanBody [hands=" + hands + ", legs=" + legs + ", name=" + name + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	public HumanBody () {
		this.hands = hands;
		this.legs = legs;
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public String getHands() {
		return hands;
	}

	public void setHands(String hands) {
		this.hands = hands;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}
}
