package com.swiggy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SwiggyLocation_Select {
	
	private Actions actions;
	
	@FindBy(id = "location")
	private WebElement location1;
	
	public SwiggyLocation_Select(WebDriver driver)
	{
		location1.sendKeys("hyderbad");
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
