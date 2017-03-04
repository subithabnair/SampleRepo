package com.cts.yahoosearch.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import com.cts.yahoosearch.constants.supportbrowsers;

public class OpenBrowser 
{
	public static WebDriver getdriver(String bn)
	{
		if(bn.equalsIgnoreCase(supportbrowsers.chrome.toString()))
		{
			System.setProperty("webdriver.chrome.driver", ".\\allbrowsers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			return driver;
		}
		if(bn.equalsIgnoreCase(supportbrowsers.firefox.toString()))
		{
			System.setProperty("webdriver.gecko.driver", ".\\allbrowsers\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			return driver;
		}
		if(bn.equalsIgnoreCase(supportbrowsers.ie.toString()))
		{
			System.setProperty("webdriver.ie.driver", ".\\allbrowsers\\IEDriverServer.exe");
			InternetExplorerDriver driver=new InternetExplorerDriver();
			return driver;
		}
		if(bn.equalsIgnoreCase(supportbrowsers.phantom.toString()))
		{
			System.setProperty("phantomjs.binary.path", ".\\allbrowsers\\phantomjs.exe");
			PhantomJSDriver driver=new PhantomJSDriver();
			return driver;
		}
		else
		{
			return null;
		}
	}
}
