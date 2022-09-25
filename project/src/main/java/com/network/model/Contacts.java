package com.network.model;

public class Contacts {

	private String username;
	private String email;
	private String contact;
	private String gender;
	private String dob;
	private String address;
	private String state;
	private String city;
	private String country;
	private String company;
	
	public Contacts() {
		// TODO Auto-generated constructor stub
	}

	public Contacts(String username, String email, String contact, String gender, String dob, String address,
			String state, String city, String country, String company) {
		super();
		this.username = username;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.state = state;
		this.city = city;
		this.country = country;
		this.company = company;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	
}
