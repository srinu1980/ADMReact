package com.cts.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("tt")
	public void setAddress(Address address) {
		System.out.println("setter method is autowrired...");
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor method is autowired");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public void init() {
		System.out.println("init method is initialized the bean");
	}

	public void destroy() {
		System.out.println("destroy method is destroy the object");
	}
}
