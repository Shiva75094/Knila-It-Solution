package com.productstore.comcast.genericUtility;

import java.io.IOException;
import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseAnnotationClass 
{
	// Object Creation for Utility Lib
	
		public FileUtility fLib=new FileUtility();
		public WebDriverUtility wLib=new WebDriverUtility();
		public WebDriver driver;
				
		public static WebDriver sDriver;
		

		@BeforeSuite()
		public void configBS()
		{
			System.out.println("===================Connect to Data Base=====================");
		}

		@BeforeClass()
		public void configBC() throws IOException 
		{
			System.out.println("===================Launch the Browser===================");
			
			//Read common data from properties file
			
		      String BROWSER = fLib.getPropertyKeyValue("browser");  
			  String URL = fLib.getPropertyKeyValue("url");

			//Step 1:Launch the Browser
			if(BROWSER.equals("chrome"))
			{
			   
				driver=new ChromeDriver();  //Launched chrome browser
			}
			else if(BROWSER.equals("firefox"))
			{
				driver=new FirefoxDriver();   //Launched firefox browser
			}
			else if(BROWSER.equals("ie"))
			{
				driver=new InternetExplorerDriver();
			}
			else
			{
				driver=new ChromeDriver();
			}

			//Step 2:Login to App
			sDriver = driver;
			wLib.maximizeWindow(driver);
			wLib.waitUntilPageLoad(driver);
			driver.get(URL);
		
		}

		

		@AfterClass()
		public void configAC()
		{
			System.out.println("===================Close the Browser===================");
			//Step 4:Close the Browser
			driver.quit();
		}
		
		@AfterSuite
		public void configAS()
		{
			System.out.println("===================Close Data Base connection=====================");

		}
}
