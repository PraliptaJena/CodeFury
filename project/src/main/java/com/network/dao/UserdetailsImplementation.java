package com.network.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.network.database.DatabaseConnection;
import com.network.exception.AdminNotFoundException;
import com.network.model.Contacts;
import com.network.model.FriendStatus;

public class UserdetailsImplementation {

	public UserdetailsImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	Connection connection = null;
	
	
	public boolean userLogin(String email, String password) throws SQLException {
		boolean result = false;
		try {
			connection = DatabaseConnection.connectionEstablish();

			String query = "Select * From user_details where email = ? and password = ?";

			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, password);
			
			ResultSet rs = stmt.executeQuery();
//			AdminDetails adminDetail = null;

			if (rs.next()) {
				result = true;
				
//				adminDetail = new AdminDetails(rs.getString("admin_name"), rs.getString("email"),
//						rs.getDouble("contact_number"));
			} else { // not required..
				throw new AdminNotFoundException("Invalid Details");
			}


		}catch(SQLException | ClassNotFoundException e) {
			throw new SQLException("Error in closing the connection");
		} catch (AdminNotFoundException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	public boolean registration(String name,String gender,String contact,String email,String password,String dob,String address,String city,String state,String country,String company) {
		//		String image = request.getParameter("username");
		
		Connection connection = null;
		boolean result = false;
			
		try {
			connection = DatabaseConnection.connectionEstablish();
			String query = "Insert into user_details(username,email,status,gender,password,dob,contact) values (?,?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);  
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, "active");
			stmt.setString(4, gender);
			stmt.setString(5, password);
			stmt.setString(6, dob);
			stmt.setString(7, contact);

			ResultSet res1 = stmt.executeQuery();
			
			String query2 = "Insert into address(email,address,city,state,country) values (?,?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(query);  
			pstmt.setString(1, email);
			pstmt.setString(2, address);
			pstmt.setString(3, city);
			pstmt.setString(4, state);
			pstmt.setString(5, country);
			pstmt.executeQuery();
			
			ResultSet res2 = pstmt.executeQuery();
			
			if(res1.next() && res2.next()) {
				System.out.println("inserted");
			}else {
				connection.rollback();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;	
		  

	}

	
	
	

	public boolean addcontact(String name, String gender, String contact, String email, String dob, String address, String city, String state, String country, String company) {
		Connection connection = null;
		boolean result = false;
			
		try {
			connection = DatabaseConnection.connectionEstablish();
			String query = "Insert into contact_details(username,email,gender,dob,contact,address,state,city,country,company) values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);  
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, gender);
			stmt.setString(4, dob);
			stmt.setString(5, contact);
			stmt.setString(6, address);
			stmt.setString(7, state);
			stmt.setString(8, city);
			stmt.setString(9, country);
			stmt.setString(10, company);

			ResultSet res = stmt.executeQuery();
			if(res.next()) {
				result = true;
			}else {
				System.out.println("error");
			}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		return result;
	}
	
	
	

	
	public List<Contacts> viewAllContacts(String email){
		Connection connection = null;
		List<Contacts> list = new ArrayList<>();
		
		try {
			connection = DatabaseConnection.connectionEstablish();
			String query = "select * from contact_details where user_email = ?";
			PreparedStatement stmt = connection.prepareStatement(query);  
			stmt.setString(1, email);
			ResultSet res = stmt.executeQuery();
			
			while(res.next()) {
				Contacts contact = new Contacts(res.getString("user_email"),res.getString("username"),res.getString("email"),
						res.getString("contact"),res.getString("dob"),res.getString("address"),res.getString("state"),
						res.getString("city"),res.getString("country"),res.getString("company"));
				list.add(contact);
			}
			
			return list;
			
		}catch(SQLException e) {
			System.out.println("error ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}


	
	
	public boolean addFriend(String email) {
		Connection connection = null;
		boolean result = false;
			
		try {
			connection = DatabaseConnection.connectionEstablish();
			String query = "Insert into friend_list(useremail,f_email,status) values (?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);  
			stmt.setString(1, email); //set your email here
			stmt.setString(2, email);  //set your friends email here
			stmt.setString(3, "friend");
			
			stmt.executeQuery();
		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}

	
	

	public List<FriendStatus> viewAllFriends(String email) {
		Connection connection = null;
		List<FriendStatus> list = new ArrayList<>();
			
		try {
						
			connection = DatabaseConnection.connectionEstablish();
			String query = "Select * from friend_list where useremail = ? where status ='friends'";
			PreparedStatement stmt = connection.prepareStatement(query);  
			stmt.setString(1, email);
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				FriendStatus fs = new FriendStatus(rs.getString("username"), rs.getString("femail"), rs.getString("name"), rs.getString("status"));
				list.add(fs);
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return list;
	}

	
}
