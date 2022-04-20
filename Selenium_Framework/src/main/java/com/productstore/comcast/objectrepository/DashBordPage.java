package com.productstore.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.jdbc.Driver;
import com.productstore.comcast.genericUtility.WebDriverUtility;

public class DashBordPage extends WebDriverUtility
{
	@FindBy(xpath="//a[text()='Monitors']")
	private WebElement mtrCtgry;
	
	@FindBy(xpath="//a[text()='Apple monitor 24']")
	private WebElement appleMonitor;
	
	@FindBy(xpath="//a[text()='ASUS Full HD']")
	private WebElement asus;
	
	public DashBordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getMtrCtgry() 
	{
		return mtrCtgry;
	}

	public WebElement getAppleMonitor() 
	{
		return appleMonitor;
	}

	public WebElement getAsus() 
	{
		return asus;
	}
	
	public void selectApple() throws Throwable
	{
		mtrCtgry.click();
		Thread.sleep(3000);
		appleMonitor.click();
		
	}
	
}
