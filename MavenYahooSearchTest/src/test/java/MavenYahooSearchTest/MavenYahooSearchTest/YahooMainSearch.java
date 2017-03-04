package MavenYahooSearchTest.MavenYahooSearchTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cts.yahoosearch.pageobjects.YahooHomePage;
import com.cts.yahoosearch.util.ApplicationUtility;
import com.cts.yahoosearch.util.ConfigReader;
import com.cts.yahoosearch.util.OpenBrowser;

public class YahooMainSearch 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=OpenBrowser.getdriver(ConfigReader.getPropertyValue("bn"));
		YahooHomePage pg=ApplicationUtility.openurl(driver, ConfigReader.getPropertyValue("app_url"));
		pg.enterSearchText("test");
		pg.clickOnAnyOnePromptedTextInSearch("testing");
	}
}
