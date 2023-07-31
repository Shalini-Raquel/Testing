package in.amazon.teststeps;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter{
		
		@Before
		public void setUp(Scenario scenario) {
			driver.init();
		}
		
		@After
		public void tearDown() {
			driver.quit();
		}

	}


