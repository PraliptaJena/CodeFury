package com.network.service;

import java.sql.SQLException;

import com.network.dao.AdminPageData;
import com.network.model.AdminDetails;

public class AdminPageServiceImplementation implements AdminPageServiceInterface{

	AdminPageData dao = new AdminPageData();
	
	public AdminPageServiceImplementation() {
		super();
	}	

	@Override
	public AdminDetails dispalyAdminDetails(String email) throws SQLException {		
		return dao.dispalyAdminDetails(email);
	}

	@Override
	public int totalBlockedUsers() throws SQLException {
		return dao.totalBlockedUsers();
	}
	
	public boolean adminLogin(String email, String Password) {
		try {
			return dao.adminLogin(email,Password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
