package com.productstore.comcast.genericUtility;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringKeyboard;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

public class ListnerImpliment implements ITestListener 
{
	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result)
	{
		String failTestName = result.getMethod().getMethodName();
		Reporter.log("test script fail",true);


		try
		{
			EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseAnnotationClass.sDriver);
			File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
			String sDate = new Date().toString().replace(":","-").replace(" ","-");
			File desc = new File("./ScreanShot/"+failTestName+"-"+sDate+".png");
			String path2 = desc.getAbsolutePath();
			FileUtils.copyFile(srcFile,desc);
		}
		catch(Exception e)
		{

		}


	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {



	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context)
	{

	}	
}
