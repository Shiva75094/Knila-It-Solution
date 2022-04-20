package com.productstore.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.productstore.comcast.genericUtility.WebDriverUtility;

public class ProductPage extends WebDriverUtility
{
	@FindBy(xpath = "//h2[text()='Apple monitor 24']")
	private WebElement nameText;
	
	@FindBy(xpath = "//h3[@class='price-container']")
	private WebElement price;
	
	
public ProductPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);	
}


public WebElement getNameText()
{
	return nameText;
}


public WebElement getPrice()
{
	return price;
}

public void captureNameText()
{
	String Name = nameText.getText(); 	
}

public void capturePriceText()
{
  
 String priceM = price.getText();
 	
}

}
