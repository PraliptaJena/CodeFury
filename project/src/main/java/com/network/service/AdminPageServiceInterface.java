package com.network.service;

import java.sql.SQLException;

import com.network.model.AdminDetails;

public interface AdminPageServiceInterface {
	public AdminDetails dispalyAdminDetails(String email) throws SQLException;
	public int totalBlockedUsers() throws SQLException;
}
