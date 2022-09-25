package com.fury;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.network.database.DatabaseConnection;
import com.network.service.AdminPageServiceImplementation;

@WebServlet("/userRegistration")
public class userRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("username");
		String gender = request.getParameter("gender");
		String contact = request.getParameter("phone");
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
		String dob = request.getParameter("birthday");
		String address = request.getParameter("username");
		String city = request.getParameter("Address");
		String state = request.getParameter("State");
		String country = request.getParameter("Country");
		String company = request.getParameter("company");

		AdminPageServiceImplementation service = new AdminPageServiceImplementation();
		service.adminLogin(request.getParameter("username"),request.getParameter("password"));

		
	}

}
