package com.network.model;

public class AdminDetails {

	private String name;
	private String email;
	private Double contact;

	public AdminDetails() {
		super();
	}

	public AdminDetails(String name, String email, Double contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	

	public Double getContact() {
		return contact;
	}
	public void setContact(Double contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "AdminDetails [name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}

	
}
