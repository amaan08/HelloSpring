package com.path;

public class Address {

	private String adrLine;
	private String city;
	private String pincode;
	
	public Address() {
		
	}
	
	public Address(String adrLine, String city, String pincode) {
		this.adrLine = adrLine;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [adrLine=" + adrLine + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
