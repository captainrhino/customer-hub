package com.esure.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class CustomerResponse {
	private List<Customer> customer =  new ArrayList<Customer>();

	public CustomerResponse() {
		
		LocalDate today = LocalDate.now();
		
		this.customer.add(new Customer("Harry","Smith",today,null,null));
		this.customer.add(new Customer("James","Potter",today,null,null));
		
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
}
