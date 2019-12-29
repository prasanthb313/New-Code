package com.listenerdemo.pages;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;;

	public class Listener implements ITestListener{

		WebDriver driver;
		 @Override  
		    public void onTestStart(ITestResult result) {  
		        // TODO Auto-generated method stub  
		          
		    }  
		  
		    @Override  
		    public void onTestSuccess(ITestResult result) {  
		        // TODO Auto-generated method stub  
		        System.out.println("Success of test cases and its details are : "+result.getName());  
		    }  
		  
		    @Override  
		    public void onTestFailure(ITestResult result) {  
		        TakesScreenshot ts=TakeScreenshot(driver);
		        File srcFile=ts.getScreenshotAs(OutputType.FILE);
		        try {
		        	   com.google.common.io.Files.copy(srcFile, new File("./ScreenShots/"+result.getName()+".jpg"));
		        	  } catch (IOException e) {
		        	   e.printStackTrace();
		        	  }
		    }
		    private TakesScreenshot TakeScreenshot(WebDriver driver2) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override  
		    public void onTestSkipped(ITestResult result) {  
		        // TODO Auto-generated method stub  
		        System.out.println("Skip of test cases and its details are : "+result.getName());  
		    }  
		  
		    @Override  
		    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		        // TODO Auto-generated method stub  
		        System.out.println("Failure of test cases and its details are : "+result.getName());  
		    }  
		  
		    @Override  
		    public void onStart(ITestContext context) {  
		        // TODO Auto-generated method stub  
		          
		    }  
		    @Override  
		    public void onFinish(ITestContext context) {  
		        // TODO Auto-generated method stub  
		          
		    } 
	}
	

	