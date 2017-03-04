package com.cts.yahoosearch.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cts.yahoosearch.pageobjects.YahooHomePage;

public class ApplicationUtility 
{
	public static YahooHomePage openurl(WebDriver driver,String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return PageFactory.initElements(driver, YahooHomePage.class);
	}
}
