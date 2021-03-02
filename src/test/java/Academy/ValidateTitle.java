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


public class ValidateTitle extends base{
	public WebDriver driver;
	//Logger log=LogManager.getLogger(base.class.getName());
	//private static Logger log = LogManager.getLogger(base.class.getName());
	Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void getBrowser() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver Initializes Successfully");
		System.out.println(driver);
		driver.get(prop.getProperty("url"));
		log.info("URL invoked");
		
	}
	
	
	@Test
	public void titleCheck() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		String s = l.getText1().getText();
		System.out.println(s);
		Assert.assertEquals(s,"FEATURED COURSES123");
	}
	
	@Test
	public void titleCheck1() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		String s = l.getText1().getText();
		System.out.println(s);
		Assert.assertEquals(s,"FEATURED COURSES123");
	}
	@Test
	public void titleCheck2() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		String s = l.getText1().getText();
		System.out.println(s);
		Assert.assertEquals(s,"FEATURED COURSES123");
	}
	
	@Test
	public void titleCheck3() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		String s = l.getText1().getText();
		System.out.println(s);
		Assert.assertEquals(s,"FEATURED COURSES123");
	}
	
	@Test
	public void titleCheck4() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		String s = l.getText1().getText();
		System.out.println(s);
		Assert.assertEquals(s,"FEATURED COURSES123");
	}
	
	@Test
	public void titleCheck5() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		String s = l.getText1().getText();
		System.out.println(s);
		Assert.assertEquals(s,"FEATURED COURSES123");
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
