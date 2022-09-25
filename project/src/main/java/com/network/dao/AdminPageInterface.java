package com.network.dao;

import java.sql.SQLException;

import com.network.model.AdminDetails;

public interface AdminPageInterface {
	public AdminDetails dispalyAdminDetails(String email) throws SQLException;
	public int totalBlockedUsers() throws SQLException;
}
