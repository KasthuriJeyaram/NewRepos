package Academy;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ResetPasswordPage;

public class ResetPassword extends base {
	
	@BeforeTest
	public void getBrowser() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test
	public void resetPasswd()
	{
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		//l.logIn();
		LoginPage lp=l.logIn();
		//lp.forgotPassword();
		ResetPasswordPage rp=lp.forgotPassword();
		rp.getEmail();
		rp.sendEmail();
		
	}
	

}
