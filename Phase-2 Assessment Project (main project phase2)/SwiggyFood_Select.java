package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyFood_Select {
	
	@FindBy(xpath = "//div[contains(@class,'V7Usk')]")
	private WebElement restaurant;

	
	public SwiggyFood_Select(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Location2() 
	{
		restaurant.click();
	}
}

