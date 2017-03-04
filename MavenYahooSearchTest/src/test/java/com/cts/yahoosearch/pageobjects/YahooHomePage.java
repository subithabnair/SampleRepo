package com.cts.yahoosearch.pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YahooHomePage extends YahooCommonPage
{
	public YahooHomePage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(how=How.XPATH,using="//input[@id='UHSearchBox']")
	private WebElement searchtextbox;
	
	@FindBy(how=How.XPATH,using="//div[@class='sa-panel sa-gossip']//li")
	private List<WebElement> listitems;
	
	public void enterSearchText(String input)
	{
		super.enterText(searchtextbox, input);
	}
	public void clickOnAnyOnePromptedTextInSearch(String input)
	{
		/*Iterator<WebElement> list=listitems.iterator();
		for(;list.hasNext();)
		{
			if(list.next().equals(input))
			{
				super.clickElement(list.next());
			}
		}*/
		for(int i=0;i<listitems.size();i++)
		{
			if(listitems.get(i).getText().equalsIgnoreCase(input))
			{
				super.clickElement(listitems.get(i));
			}
		}
		//super.clickElement(listitems.get(2));
		
	}
}
