package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	//PageFactory.initElements(driver, this);
		
	}
	By navigation = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By contact = By.xpath("//*[text()='Contact']");
	By text = By.className("text-center");
	By signIn = By.xpath("//a[contains(@href,'sign_in')]");
	By practice = By.linkText("Practice");
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(navigation);
	}
	
	public WebElement getContact()
	{
		return driver.findElement(contact);
	}
	
	public WebElement getText1()
	{
		return driver.findElement(text);
	}
		
	public LoginPage logIn()
	{
		driver.findElement(signIn).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
		
	}
	
	public WebElement practice()
	{
		return driver.findElement(practice);
	}
	
	
}
