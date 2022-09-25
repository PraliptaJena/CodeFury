package com.network.service;

import java.util.List;

import com.network.model.Contacts;
import com.network.model.FriendStatus;

public interface UserpageInterface {
	public boolean registerUser(String name,String gender,String contact,String email,String password,String dob,String address,String city,String state,String country,String company);
	public boolean addContact(String name,String gender,String contact,String email,String dob,String address,String city,String state,String country,String company);
	public List<Contacts> viewContacts(String email);
	public boolean addFriend(String email);
	public List<FriendStatus> viewAllFriends(String email);
}
