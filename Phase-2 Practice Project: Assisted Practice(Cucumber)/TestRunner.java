package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(
			features = "Features//verify_error_message.feature",
			glue = "in.amazon.teststeps"
			//dryRun = true
			//tags = "@TC_102 and @login_functionality"
			)
	public class TestRunner extends AbstractTestNGCucumberTests {
}

