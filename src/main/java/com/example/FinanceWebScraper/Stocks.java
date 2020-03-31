package com.example.FinanceWebScraper;

import java.sql.Timestamp;
import java.util.Date;

public class Stocks
{
	private Integer id;
	private String stockName;
	private String lastPrice;
	private String priceChange;
	private String changeRate;
	private String currency;
	private String marketTime;
	private String volume;
	private String averageVolume;
	private String marketCap;
	private Date timeScraped;
	
	public Stocks()
	{
		
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public void setId(Integer id)
	{
		this.id= id;
	}
	
	public String getStockName()
	{
		return stockName;
	}
	
	public void setStockName(String stockName)
	{
		this.stockName = stockName;
	}
	
	public String lastPrice()
	{
		return lastPrice;
	}
	
	public void setLastPrice(String lastPrice)
	{
		this.lastPrice = lastPrice;
	}
	
	public String priceChange()
	{
		return priceChange;
	}
	
	public void setPriceChange(String priceChange)
	{
		this.priceChange = priceChange;
	}
	
	public String changeRate()
	{
		return changeRate;
	}
	
	public void setChangeRate(String changeRate)
	{
		this.changeRate = changeRate;
	}
	
	public String getCurrency()
	{
		return currency;
	}
	
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}
	
	public String getMarketTime()
	{
		return marketTime;
	}
	
	public void setMarketTime(String marketTime)
	{
		this.marketTime = marketTime;
	}
	
	public String getAverageVolume()
	{
		return averageVolume;
	}
	
	public void setAverageVolume(String averageVolume)
	{
		this.averageVolume = averageVolume;
	}
	
	public String getMarketCap()
	{
		return marketCap;
	}
	
	public void setMarketCap(String marketCap)
	{
		this.marketCap = marketCap;
	}
	
	
		
}
