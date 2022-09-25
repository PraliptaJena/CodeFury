package com.network.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.network.database.DatabaseConnection;
import com.network.exception.AdminNotFoundException;
import com.network.model.AdminDetails;

public class AdminPageData implements AdminPageInterface{

	Connection connection = null;
	
	public AdminPageData() {
		super();
	}

	public boolean adminLogin(String email, String password) throws SQLException {
		boolean result = false;
		try {
			connection = DatabaseConnection.connectionEstablish();

			String query = "Select * From admin_details where email = ? and password = ?";

			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, password);
			
			ResultSet rs = stmt.executeQuery();
			AdminDetails adminDetail = null;

			if (rs.next()) {
				result = true;
				adminDetail = new AdminDetails(rs.getString("admin_name"), rs.getString("email"),
						rs.getDouble("contact_number"));

			} else { // not required..
				throw new AdminNotFoundException("Invalid Details");
			}


		}catch(SQLException | ClassNotFoundException e) {
			throw new SQLException("Error in closing the connection");
		} catch (AdminNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	public AdminDetails dispalyAdminDetails(String email) throws SQLException {
		Connection connection = null;
		try {
			connection = DatabaseConnection.connectionEstablish();

			String query = "Select * From admin_details where email = ?";

			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			AdminDetails adminDetail = null;

			if (rs.next()) {

				adminDetail = new AdminDetails(rs.getString("admin_name"), rs.getString("email"),
						rs.getDouble("contact_number"));

			} else { // not required..
				System.out.println("not running..");
			}

			System.out.println(adminDetail);
			System.out.print(adminDetail.getEmail());
			return adminDetail;

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			throw new SQLException("Class Is not Found Exception");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException("There is some error in the query");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SQLException("Error in closing the connection");
			}
		}
	}
	
	
	public int totalBlockedUsers() throws SQLException {
		Connection connection = null;
		try {
			connection = DatabaseConnection.connectionEstablish();

			String query = "Select count(*) AS count From user_details where status = 'blocked' and block_status ='3'";

			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			int result = 0;
			if(rs.next()) {
				result= rs.getInt("count");
			}

			return result;
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()); 
			throw new SQLException("Class Is not Found Exception");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException("There is some error in the query");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SQLException("Error in closing the connection");
			}
		}
		
	}

	
	public void usersToBeDeleted() throws SQLException {
		Connection connection = null;
		try {
			connection = DatabaseConnection.connectionEstablish();

			String query = "Select username,email,block_status From user_details where status = 'active' and block_status ='3'";

			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			int result = 0;
			while(rs.next()) {
				System.out.print("email ------" + rs.getString("email"));
			}

						
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()); 
			throw new SQLException("Class Is not Found Exception");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException("There is some error in the query");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SQLException("Error in closing the connection");
			}
		}
		
	}

	
	
	
	public void deleteUsers(List<Integer> users) throws SQLException {
		Connection connection = null;
		try {
			connection = DatabaseConnection.connectionEstablish();

			String query = "update user_details set status = 'false' and block_status = 3 Where id = ? ";

			PreparedStatement stmt = connection.prepareStatement(query);
			
			for(Integer userid : users) {
				stmt.setInt(1, userid);
				stmt.addBatch();
			}
			
			int[] i = stmt.executeBatch();
			
			System.out.println(i);
			connection.commit();
//			ResultSet rs = stmt.executeQuery();
//			int result = 0;
//			while(rs.next()) {
//				System.out.print("email ------" + rs.getString("email"));
//			}

						
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage()); 
			throw new SQLException("Class Is not Found Exception");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException("There is some error in the query");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new SQLException("Error in closing the connection");
			}
		}
		
	}
	
	

}
