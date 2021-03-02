package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Academy.base;

public class ResetPasswordPage extends base{
	
	public WebDriver driver;
	
	public ResetPasswordPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email_ID = By.name("email");
	By submit = By.name("commit");
	
	public void getEmail()
	{
		driver.findElement(email_ID).sendKeys("abc1@gmail.com");
	}
	
	public void sendEmail()
	{
		driver.findElement(submit).click();
	}

}
