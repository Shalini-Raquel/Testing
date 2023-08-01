package com.swiggy.teststeps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Swiggy_BeforeAfter extends Tools{
	
	@Before
	public void setUp(Scenario scenario) {
		Driver1.init();
	}
	
	@After
	public void tearDown() {
		driver.quit();

}
}




