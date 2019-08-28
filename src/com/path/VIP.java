package com.path;

public class VIP extends Person{

	
	String security;

	public VIP(int id, String name, Address address, String security) {
		super(id, name, address);
		this.security = security;
	}

	@Override
	public String toString() {
		return  super.toString()+" VIP [security=" + security + "]";
	}
	
	
}
