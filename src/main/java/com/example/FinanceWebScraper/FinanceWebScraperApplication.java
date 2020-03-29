package com.example.FinanceWebScraper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.FinanceWebScraper.Driver;

@SpringBootApplication
public class FinanceWebScraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceWebScraperApplication.class, args);
		System.out.println("Web Scraper started");
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	    //Driver.startDriver();
		JdbcConnection db = new JdbcConnection();
		db.ConnectToDatabase();
	}

}
