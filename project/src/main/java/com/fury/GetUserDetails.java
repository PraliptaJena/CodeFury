package com.fury;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.network.database.DatabaseConnection;
import com.network.exception.AdminNotFoundException;

/**
 * Servlet implementation class GetUserDetails
 */
@WebServlet("/GetUserDetails")
public class GetUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection = null;
		try {
			connection = DatabaseConnection.connectionEstablish();

			String query = "Select * From user_details where username = ?";

			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, request.getParameter("username"));
						
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				request.setAttribute("email", rs.getString("email"));
				request.setAttribute("name", rs.getString("username"));
				request.setAttribute("contact" , rs.getString("contact"));
				
			} else { // not required..
				throw new AdminNotFoundException("Invalid Details");
			}


		}catch(SQLException | ClassNotFoundException e) {
			System.out.println("error");
//			throw new SQLException("Error in closing the connection");
		} catch (AdminNotFoundException e) {
			e.printStackTrace();
		}
	}

}
