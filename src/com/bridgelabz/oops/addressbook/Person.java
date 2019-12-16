package com.bridgelabz.oops.addressbook;

/******************************************************************************
 * 
 * 1. Purpose : Address Book Problem
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 02-12-2019
 *
 ******************************************************************************/
public class Person {
	private String firstName;
	private String lastName;
	private long contactNo;
	private Address address;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, long contactNo, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

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

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", contactNo=" + contactNo + ", address="
				+ address + "]";
	}
}