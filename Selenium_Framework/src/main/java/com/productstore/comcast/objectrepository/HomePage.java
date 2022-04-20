package com.productstore.comcast.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	WebDriver driver;
	@FindBy(xpath="//a[text()='Home ']")
	private WebElement home;
	
	@FindBy(xpath="//a[text()='Nexus 6']")
	private WebElement anyproduct;
	
	@FindBy(xpath="//a[text()='Cart']")
	private WebElement cart;
	
	/**
	 * @return the cart
	 */
	public WebElement getCart() {
		return cart;
	}


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getHome() 
	{
		return home;
	}
	
	public String verifypName()
	{
		
	 String vproduct = driver.findElement(By.xpath("//a[text()='Nexus 6']")).getText();
	  return vproduct;
	}
	
	public void productclick()
	{
		anyproduct.click();
	}
   
	
	public void home()
	{
		home.click();
	}
}
