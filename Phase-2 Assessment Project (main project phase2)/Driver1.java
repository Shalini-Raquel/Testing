package com.swiggy.teststeps;



import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggy.pages.LandingPageon_Add_food;
import com.swiggy.pages.SwiggyFood_Select;
import com.swiggy.pages.SwiggyLocation_Select;

public class Driver1  extends Tools{
	

	//protected static WebDriver driver;
	
	protected static  LandingPageon_Add_food landingPageon_Add_food;
	protected static SwiggyLocation_Select swiggyLocation_Select;
	protected static SwiggyFood_Select swiggyFood_Select;
	
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		landingPageon_Add_food= new LandingPageon_Add_food(driver);
		swiggyLocation_Select = new SwiggyLocation_Select(driver);
		swiggyFood_Select = new SwiggyFood_Select(driver);
		
	}
}


