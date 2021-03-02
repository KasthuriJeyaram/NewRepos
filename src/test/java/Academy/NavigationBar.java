package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;


public class NavigationBar extends base {
	public WebDriver driver;
	Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void getBrowser() throws IOException
	{
		driver=initializeDriver();
		log.info("Diver Invoked Successfully");
		System.out.println(driver);
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void navigationCheck() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		//l.getContact().isDisplayed();
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
