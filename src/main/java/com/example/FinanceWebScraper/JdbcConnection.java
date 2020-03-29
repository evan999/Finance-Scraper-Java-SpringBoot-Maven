package com.example.FinanceWebScraper;

import java.util.Properties;
import java.sql.*;

public class JdbcConnection
{
	public void ConnectToDatabase()
	{
		String url = "jdbc:postgresql://localhost:8080/test";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "secret");
		props.setProperty("ssl", "true");
		
		//Connection conn = DriverManager.getConnection(url);
		
	}
}
