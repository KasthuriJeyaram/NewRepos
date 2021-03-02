package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.name("email");
	By password = By.name(" password");
	By commit = By.name("commit");
	By forgetPassword=By.xpath("//a[contains(@href,'index')]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public LoginPage getLogIn()
	{
		driver.findElement(commit).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	public ResetPasswordPage forgotPassword()
	{
		driver.findElement(forgetPassword).click();
		ResetPasswordPage rp = new ResetPasswordPage(driver);
		return rp;
	}

}
