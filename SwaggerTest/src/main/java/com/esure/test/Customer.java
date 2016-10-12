package com.esure.test;

import java.time.LocalDate;
import java.util.List;

public class Customer {
	public Customer(String firstName, String lastName, LocalDate dob, List<Policy> policys, List<Address> addresses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.policys = policys;
		this.addresses = addresses;
	}

	private String firstName;
	private String lastName;
	
	private LocalDate dob;
	private List<Policy> policys;
	private List<Address> addresses;
	
	



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public List<Policy> getPolicys() {
		return policys;
	}

	public void setPolicys(List<Policy> policys) {
		this.policys = policys;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
