package in.Simplilearn.RestAssuredDemo;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Level;

import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import io.restassured.response.Response;

public class TestBase {
	
	
	public static RequestSpecification httpRequest;
	public static Response response;
	
	public Logger logger;
	
	@BeforeClass
	public void setUp() {
		logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}

}
