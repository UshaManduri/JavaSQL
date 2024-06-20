package com.tasksforusha;

public class Address {
	private String street;
	private int house_num;
	
	public void address() {
		this.street = street;
		this.house_num = house_num;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", house_num=" + house_num + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouse_num() {
		return house_num;
	}

	public void setHouse_num(int house_num) {
		this.house_num = house_num;
	}
	
}
