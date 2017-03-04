package com.cts.ProfilesOfBrowser;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProfilesOfBrowsers 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\allbrowsers\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\umeshu\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		options.addArguments("--start-maximized");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://www.seleniumhq.org/download/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\SeleniumTrainingbyJitendra\\temp\\snapshot.jpg"));*/
		
		driver.findElement(By.xpath("//a[contains(text(),'3.2.0')]")).click();
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\SeleniumTrainingbyJitendra\\temp\\snapshot.jpg"));
		
	}
	
}
