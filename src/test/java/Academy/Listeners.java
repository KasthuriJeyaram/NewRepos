package Academy;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listeners extends base implements ITestListener{
	ExtentTest	test;
	//ExtentReports extent=ReportsInfo.config();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();// When using parallel execution, every test case will try to invoke the
	//test object. So we need to create object for ThreadLocal call which is thread safe.

	
	public void onFinish(ITestContext result) {
		//extent.flush();
	}

	public void onStart(ITestContext result) {
		
	//test = extent.createTest("TestCase1");//when ever the test is captutred, an object will create for ExtentTest.
	extentTest.set(test);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		//test.fail(result.getThrowable());
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String testMethodName=result.getMethod().getMethodName();
		try {
			driver = 	(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenshot(testMethodName,driver), result.getMethod().getMethodName());
			//getScreenshot(testMethodName,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		//test.log(Status.PASS, "TestCase Passes");
		extentTest.get().log(Status.PASS, "TestCase Passed");
	}

}
