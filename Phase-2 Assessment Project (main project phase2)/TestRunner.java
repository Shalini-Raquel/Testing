package com.swiggy.teststeps;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features = "Features//swiggyorder.feature",
			glue = "com.swiggy.teststeps"
			)
	public class TestRunner extends AbstractTestNGCucumberTests {
}

