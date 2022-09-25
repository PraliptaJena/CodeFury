package com.network.dao;

import java.sql.SQLException;
import java.util.List;

import com.network.model.Contacts;
import com.network.model.FriendStatus;

public interface UserdetailsInterface {
	public boolean userLogin(String email, String password) throws SQLException;
	public boolean addcontact(String name, String gender, String contact, String email, String dob, String address, String city, String state, String country, String company);
	public List<Contacts> viewAllContacts(String email);
	public boolean addFriend(String email);
	public List<FriendStatus> viewAllFriends(String email);
}
