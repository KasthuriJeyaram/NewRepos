package resources;


import org.testng.annotations.BeforeTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsInfo {
	
	public static ExtentReports extent;
	@BeforeTest
	public static ExtentReports config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("E2E Project Reports");
		reporter.config().setDocumentTitle("UI Reports");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "ACS Tester");
		return extent;
		
	}

}
