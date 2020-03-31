package com.example.FinanceWebScraper;

import java.util.Properties;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

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
		
		try 
		{
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
		}
		catch(SQLException err)
		{
			System.out.println(err.getMessage());
		}
		
		return connection;
		
	}
	
	public void insertStock()
	{
		Statement statement = null;
		try
		{
			String insertQuery = "INSERT INTO Stocks "
					+ "(ID, STOCK_NAME, LAST_PRICE, PRICE_CHANGE, CHANGE_RATE, CURRENCY, MARKET_TIME, VOLUME, AVERAGE_VOLUME, MARKET_CAP, TIME_SCRAPED)"
					+ "VALUES (id, stock_name, last_price, price_change, change_rate, currency, market_time, volume, average_volume, market_cap, time_scraped);";
			statement.executeUpdate(insertQuery);
		}
		catch(Exception error)
		{	
			//System.err.println(error.getClass(), )
		}
		
		
		
	}
	
	
}
