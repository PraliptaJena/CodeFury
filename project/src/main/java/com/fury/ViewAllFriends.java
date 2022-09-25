package com.fury;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.network.service.UserPageImplementation;

/**
 * Servlet implementation class ViewAllFriends
 */
@WebServlet("/ViewAllFriends")
public class ViewAllFriends extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ViewAllFriends() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email ="abc@sd.com";
		UserPageImplementation upi = new UserPageImplementation();
		upi.viewAllFriends(email);
	}
	
	
}
