package com.fury;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.network.dao.AdminPageData;
import com.network.database.DatabaseConnection;
import com.network.model.AdminDetails;
import com.network.service.AdminPageServiceImplementation;


@WebServlet("/testServlet")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello");
		
		 
		 try {
			 
			 AdminPageServiceImplementation service = new AdminPageServiceImplementation();
			 service.dispalyAdminDetails("admin123@admin.com");
			 
			 int totalBlockedUsers = service.totalBlockedUsers();
			 
			 
			 System.out.println(totalBlockedUsers);	 	 
			 
			 
			 
			 AdminPageData ad = new AdminPageData();
			 ad.usersToBeDeleted();
			 
			 
			 List<Integer> list = new ArrayList<>();
			 list.add(107);
			 list.add(108);
			 ad.deleteUsers(list);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
