package MavenYahooSearchTest.MavenYahooSearchTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cts.yahoosearch.util.ApplicationUtility;
import com.cts.yahoosearch.util.ConfigReader;
import com.cts.yahoosearch.util.OpenBrowser;

public class HTMLProg3ReadLiElementsList
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=OpenBrowser.getdriver(ConfigReader.getPropertyValue("bn"));
		ApplicationUtility.openurl(driver,"file:///C:/SeleniumTrainingbyJitendra/Practicals/HTML%20practicals/Xpath4.html");
		List<WebElement> allrows=driver.findElements(By.xpath("//ul"));
		//System.out.println(allrows.size());
		for(int i=0;i<allrows.size();i++)
		{
			List<WebElement> allcol=allrows.get(i).findElements(By.tagName("li"));
			for(int j=0;j<allcol.size();j++)
			{
				if(allcol.get(j).getText().equalsIgnoreCase("Testing"))
				{
					System.out.println(allcol.get(j).getText());
				}
			}
		}
	}
}