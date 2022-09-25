package com.network.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection connectionEstablish() throws SQLException, ClassNotFoundException {
		 Class.forName("org.postgresql.Driver");		 
		 System.out.println("driver class got loaded");		 
		 Connection conection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/codefury","postgres","postgres");
		 return conection;
	}
}
