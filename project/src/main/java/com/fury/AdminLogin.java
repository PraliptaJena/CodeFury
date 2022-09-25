package com.fury;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.network.service.AdminPageServiceImplementation;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String email = request.getParameter("email");
    	String password = request.getParameter("password");
    	
    	AdminPageServiceImplementation service = new AdminPageServiceImplementation();
    	
    	try {
    		boolean result = service.adminLogin(email, password);
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    }

}
