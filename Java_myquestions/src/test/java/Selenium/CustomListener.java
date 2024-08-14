package Selenium;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class CustomListener implements ITestListener  {
	 WebDriver driver;

	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test started: " + result.getName());
	        
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test failed: " + result.getName());
	        
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test skipped: " + result.getName());
	    }


	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("Test Suite finished: " + context.getName());
	        
	    }
}
