package com.path;

public class Person {

	private int id;
	private String name;
	
	Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
