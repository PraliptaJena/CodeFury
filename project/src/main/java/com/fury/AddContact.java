package com.fury;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.network.model.Contacts;
import com.network.service.UserPageImplementation;

@WebServlet("/AddContact")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddContact() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserPageImplementation upi = new UserPageImplementation();
			
			String name = request.getParameter("username");
			String gender = request.getParameter("gender");
			String contact = request.getParameter("phone");
			String email = request.getParameter("email");
			String dob = request.getParameter("birthday");
			String address = request.getParameter("username");
			String city = request.getParameter("Address");
			String state = request.getParameter("State");
			String country = request.getParameter("Country");
			String company = request.getParameter("company");
			
			boolean result = upi.addContact(name,gender,contact,email,dob,address,city,state,country,company);
			System.out.println(result);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());		}
	}

}
