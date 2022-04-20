package com.productstore.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.productstore.comcast.genericUtility.WebDriverUtility;

public class AddToCartPage extends WebDriverUtility
{
	

	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement addToCard;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCart()
	{
		return addToCard;
	}
	
	public void clickAdd() throws InterruptedException
	{
		Thread.sleep(3000);
		addToCard.click();
		
	}
	
	
	
	public String add()
	{
		String expected="Product added";
		return expected;
	}
}
