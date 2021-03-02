package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base{
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Kasthuri Jeyaram\\workspace\\E2E\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();		
		}
		
		return driver;
			
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		String target = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		org.apache.commons.io.FileUtils.copyFile(src, new File(target));
		//File target= new File(System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png");
		//org.apache.commons.io.FileUtils.copyFile(src, target);
		return target;
		
		
	}
	
}
