package MavenYahooSearchTest.MavenYahooSearchTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cts.yahoosearch.util.ApplicationUtility;
import com.cts.yahoosearch.util.ConfigReader;
import com.cts.yahoosearch.util.OpenBrowser;

public class HTMLProg1ReadTdListElements 
{
	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver=OpenBrowser.getdriver(ConfigReader.getPropertyValue("bn"));
		ApplicationUtility.openurl(driver,"file:///C:/SeleniumTrainingbyJitendra/Practicals/HTML%20practicals/Xpath2.html");
		List<WebElement> allrows=driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(allrows.size());
		for(int i=0;i<allrows.size();i++)
		{
			if(allrows.get(i).getText().equalsIgnoreCase("Testing"))
			{
				System.out.println(allrows.get(i).getText());
			}
		}
	}
}
