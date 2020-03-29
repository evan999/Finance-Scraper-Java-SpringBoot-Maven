package com.example.FinanceWebScraper;

import java.util.Properties;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class JdbcConnection
{
	public Connection ConnectToDatabase()
	{
		//String url = "jdbc:postgresql://localhost:8080/test";
		//Properties props = new Properties();
		//props.setProperty("user", "postgres");
		//props.setProperty("password", "secret");
		//props.setProperty("ssl", "true");
		
		//Connection conn = DriverManager.getConnection(url, props);
		
		final String url = "jdbc:postgresql://localhost/finance";
		final String user = "postgres";
		final String password = "secret";
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
		}
		catch(SQLException err){
			System.out.println(err.getMessage());
		}
		
		return connection;
		
	}
}
