package com.cts.yahoosearch.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class YahooCommonPage
{
	protected WebDriver driver;
	protected YahooCommonPage(WebDriver driver)
	{
		this.driver=driver;
	}
	protected void enterText(WebElement element,String input)
	{
		element.sendKeys(input);
	}
	protected void clickElement(WebElement element)
	{
		element.click();
	}
}
