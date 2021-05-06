package com.ibm.model;

public class Address {

	private int addressId;
	private String street;
	private String city;
	private String zipcode;
	private Person person;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Person getPersion() {
		return person;
	}

	public void setPerson(Person persion) {
		this.person = persion;
	}

}