package in.Simplilearn.RestAssuredDemo;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PUTDemoBearerTokenJsonPath {
	
HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Supermann");
		map.put("email","superman554463@gmail.com");
		map.put("gender","male");
		map.put("status","active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath ="public/v2/users/4495044";
	}
	
	
   @Test
	
	public void updateResource() {
	   Response response = RestAssured
		     .given()
		          .contentType("application/json")
		          .header("Authorization","Bearer e7d7891f1269139ed0955600f593a59a68267786dce1013a44403d2c0ab45a09")
		          .body(map)
		      .when()
		           .put()
		      .then()
		           .extract().response();
	   JsonPath jsonPath = response.jsonPath();
	   Assert.assertTrue(jsonPath.get("name").toString().equals("Supermann"));

}
}
