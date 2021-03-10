package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base{
	public WebDriver driver;
	Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void getBrowser() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver Invoked");
		
	}
	@Test
	public void disp()
	{
		System.out.println("Changes");
	}
	@Test
	public void disp1y()
	{
		System.out.println("Changes");
	}
	
	@Test
	public void disp2y()
	{
		System.out.println("Changes2y");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
	
		
		//LoginPage lp=new LoginPage(driver);
		LoginPage lp=l.logIn();
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
	//	System.out.println(Info);
		lp.getLogIn();
		//String Username, String Password
		//dataProvider="getData"
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[4][2];
		
		data[0][0]="abc1@gmail.com";
		data[0][1]="pass1";
			
		data[1][0]="abc2@gmail.com";
		data[1][1]="pass2";
			
		data[2][0]="abc3@gmail.com";
		data[2][1]="pass3";
	
		data[3][0]="abc4@gmail.com";
		data[3][1]="pass4";
		
		
		return data;
	
	}
}
