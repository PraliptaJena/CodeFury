package com.network.service;

import java.util.List;

import com.network.dao.UserdetailsImplementation;
import com.network.model.Contacts;
import com.network.model.FriendStatus;

public class UserPageImplementation {

	UserdetailsImplementation dao = new UserdetailsImplementation();
	public UserPageImplementation() {
	}
	
	
	public boolean registerUser(String name,String gender,String contact,String email,String password,String dob,String address,String city,String state,String country,String company) {
		return dao.registration(name,gender,contact,email,password,dob,address,city,state,country,company);
	}
	
	public boolean addContact(String name,String gender,String contact,String email,String dob,String address,String city,String state,String country,String company) {
		return dao.addcontact(name,gender,contact,email,dob,address,city,state,country,company);
	}
	
	public List<Contacts> viewContacts(String email) {
		return dao.viewAllContacts(email);
	}


	public boolean addFriend(String email) {
		return dao.addFriend(email);
	}


	public List<FriendStatus> viewAllFriends(String email) {
		return dao.viewAllFriends(email);
	}
	

}
